<template>
  <el-container style="width: 100%">
    <el-header><Header></Header></el-header>
    <el-main><PostForm></PostForm></el-main>
    <el-footer>
      <div id="copyright">
        © 2014 aria - yorha.org <span style="color: #999;font-weight: lighter">All rights reserved.</span>
      </div>
    </el-footer>
  </el-container>
</template>

<script>
  import Header from '@/views/login/Header'
  import PostForm from '@/views/login/PostForm'
    export default {
      components:{
        Header,PostForm
      }
    }
</script>

<style scoped>
  body{
    background-color: white;
  }
  .el-header{
    border-bottom: black;
    border-width: 1px;
    box-shadow: 1px 0 5px #6f7180;
    margin-bottom: 1px;
    line-height: 60px;
    background-color: white;
  }
  .el-main{
    text-align: center;
    background-color: #ebebeb;
    box-shadow: 0px 0.5px 3px #888888;
    margin-bottom: 1px;
  }
  .el-footer{
    text-align: right;
  }
  #copyright{
    margin: 20px 100px 0 50px;
    color: #555;
    font-size: 0.9em;
    font-weight:bolder;
  }
</style>
