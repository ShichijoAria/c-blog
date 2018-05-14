<template>
  <el-row justify="center" type="flex" style="margin-bottom: 50px">
    <el-col :xs="24" :sm="17" :md="10" :lg="6" :xl="6">
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" status-icon>
        <el-card style="margin-top: 75px" :body-style="	{ padding: '0px' }">
          <div slot="header" class="clearfix" style="text-align: left;">
            <span style="font-size: 14px;font-weight: bold;color: #333">Sign In</span>
          </div>
          <div style="padding: 14px;">
            <div class="bottom clearfix">
              <el-form-item label="" prop="username">
                  <el-input
                    placeholder="用户名"
                    v-model="ruleForm.username" auto-complete="off">
                    <i slot="prefix"><iconSVG iconStyle="iconStyle" icon-class="people"></iconSVG></i>
                  </el-input>
                </el-form-item>
              <el-form-item label="" prop="password">
                  <el-input
                    type="password"
                    placeholder="密码"
                    v-model="ruleForm.password" auto-complete="off">
                    <i slot="prefix"><iconSVG iconStyle="iconStyle" icon-class="lock"></iconSVG></i>
                  </el-input>
                </el-form-item>
            </div>
          </div>
            <el-row id="subCard" align="top" type="flex">
              <el-col :span="6" :offset="1">
                <el-checkbox v-model="ruleForm.checked">记住登录</el-checkbox>
              </el-col>
              <el-col :span="6" :offset="11">
                <el-button  type="primary" size="small" @click="postLogin()" round>登录</el-button>
              </el-col>
            </el-row>
        </el-card>
      </el-form>
    </el-col>
  </el-row>
</template>

<script>
  import router from '@/router'
  export default {
    data() {
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        }
        callback()
      };
      var validateName = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入用户名'));
        }
        callback()
      };
      return {
        ruleForm: {
          username: '',
          password: '',
          checked: true
        },
        rules: {
          password: [
            { validator: validatePass, trigger: 'blur' }
          ],
          username: [
            { validator: validateName, trigger: 'blur' }
          ]
        }
      }
    },
    methods:{
      postLogin(){
        this.$refs.ruleForm.validate((valid) => {
          if (valid) {
            this.axios.post("http://localhost:8081/login?username="+this.ruleForm.username+"&password="+this.ruleForm.password).then((response) => {
              if(response.data.msg=="success") {
                console.log(response.data)
                this.$router.push({path:'/admin'})
              }
            })
          } else {
            console.log('error submit!!');
            return false;
          }
        });

      }
    }
  }
</script>

<style>
  .text {
    font-size: 14px;
  }

  .item {
    margin-bottom: 18px;
  }

  .el-card__header{
    background-color: #f6f6f6;
  }

  .box-card {
    width: 480px;
  }
  .iconStyle{
    width: 2em;
    height: 2em;
    vertical-align: -0.6em;
    fill: #bfcbd9;
    overflow: hidden;
  }
  #subCard{
    background-color: #f9f9f9;
    font-size: 1.5em;
    line-height: 1.5em;
    padding: 10px 14px 10px 14px;
    border-width: 1px;
    box-shadow: -1px 0px 0px 1px #c6c9e4;
  }
</style>
