<template>
  <div>
    <el-row>
      <el-col v-for="bean in contextData" :key="contextData.id" :span="24"><div class="grid-content bg-purple-dark">
        <el-row style="margin-bottom: 20px">
        <el-card  v-loading="flag" shadow="hover" :body-style="{ padding: '0px' }">
          <el-row>
            <el-col :span="18">
              <div class="grid context" style="text-align: left;padding: 25px 0 0 50px;line-height: 30px">
                {{ bean.context }}
              </div>
            </el-col>
          </el-row>
          <div style="padding: 14px;">
            <div class="bottom clearfix">
              <time class="time">{{ contextData.publicatedTime }}</time>
              <el-button type="text" class="button">评论</el-button>
            </div>
          </div>
        </el-card>
      </el-row>
      </div></el-col>
    </el-row>
    <div class="block">
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage"
        :page-sizes="[5, 10, 20]"
        :page-size="5"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total">
      </el-pagination>
    </div>
  </div>
</template>

<style>
  .time {
    font-size: 13px;
    color: #999;
  }

  .bottom {
    margin-top: 13px;
    line-height: 12px;
  }

  .button {
    padding: 0;
    float: right;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }

  .clearfix:after {
    clear: both
  }
</style>

<script>
  export default {
    data(){
      return{
        contextData:{},
        flag:true,
        currentPage: 1,
        pageNum:1,
        pageSize:5,
        total:0
      }
    },
    created(){
      this.postJabber();
    },
    methods: {
      handleSizeChange(val) {
        let preSize=this.pageSize
        this.pageSize=Number(`${val}`)
        this.pageNum=this.pageNum*parseInt(preSize/this.pageSize)
        this.postJabber();
      },
      handleCurrentChange(val) {
        this.pageNum=Number(`${val}`)
        this.postJabber();
      },
      postJabber(){
        this.axios.post("http://localhost:8081/jabber/selectAll?pageNum="+this.pageNum+
            "&pageSize="+this.pageSize).then((response) => {
          this.contextData=response.data["list"]
          this.total=response.data["total"]
          this.flag=false
        })
      }
    }
  }
</script>

<style scoped>

</style>
