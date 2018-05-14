<template>
  <div>
    <el-table
      ref="multipleTable"
      :data="tableData"
      tooltip-effect="dark"
      style="width: 100%"
      @selection-change="handleSelectionChange">
      <el-table-column
        align="left"
        header-align="left"
        type="selection"
        width="55">
      </el-table-column>
      <el-table-column
        align="center"
        header-align="center"
        prop="name"
        label="名称">
      </el-table-column>
      <el-table-column
        align="center"
        header-align="center"
        label="日期"
        width="120">
        <template slot-scope="scope">{{ scope.row.publicatedTime }}</template>
      </el-table-column>
      <el-table-column label="操作"
                       align="center"
                       header-align="center">
        <template slot-scope="scope">
          <el-button
            size="mini"
            @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <div style="margin-top: 20px">
      <el-button @click="toggleSelection([tableData3[1], tableData3[2]])">切换第二、第三行的选中状态</el-button>
      <el-button @click="toggleSelection()">取消选择</el-button>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          publicatedTime: '2016-05-03',
          name: '王小虎'
        }, {
          date: '2016-05-02',
          name: '王小虎'
        }, {
          date: '2016-05-04',
          name: '王小虎',
        }, {
          date: '2016-05-01',
          name: '王小虎',
        }, {
          date: '2016-05-08',
          name: '王小虎',
        }, {
          date: '2016-05-06',
          name: '王小虎'
        }, {
          date: '2016-05-07',
          name: '王小虎'
        }],
        multipleSelection: []
      }
    },

    methods: {
      toggleSelection(rows) {
        if (rows) {
          rows.forEach(row => {
            this.$refs.multipleTable.toggleRowSelection(row);
          });
        } else {
          this.$refs.multipleTable.clearSelection();
        }
      },
      handleSelectionChange(val) {
        this.multipleSelection = val;
      },
      handleEdit(index, row) {
        console.log(index, row);
      },
      handleDelete(index, row) {
        console.log(index, row);
      },
      postJabber(){
        this.axios.post("http://localhost:8081/admin/item/selectAll?pageNum="+this.pageNum+
          "&pageSize="+this.pageSize).then((response) => {
          this.contextData=response.data["list"]
          this.total=response.data["total"]
          this.flag=false
        })
      }
    }
  }
</script>
