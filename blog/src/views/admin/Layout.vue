<template>
    <div>
      <el-container>
        <el-header><Header></Header></el-header>
        <el-main style="padding: 20px 0 30px 0"><Navigation></Navigation></el-main>
        <el-footer>Footer</el-footer>
      </el-container>
    </div>
</template>

<script>
  import Navigation from '@/views/admin/Navigation'
  import Header from '@/views/admin/Header'
  export default {
    name: "Layout",
    components:{
      Navigation,
      Header
    }
  }
</script>

<style scoped>
  .el-header{
    border-bottom: black;
    border-width: 1px;
    box-shadow: 1px 1px 5px #6f7180;
    margin-bottom: 10px;
    line-height: 60px;
    background-color: white;
  }

</style>
