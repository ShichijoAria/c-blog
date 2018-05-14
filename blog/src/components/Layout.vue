<template>
  <div>
    <el-container>
      <el-header height="400px"><HeadWithPicture></HeadWithPicture></el-header>
      <el-container>
        <el-aside>
        </el-aside>
        <el-main>
          <Navigation></Navigation>
        </el-main>
        <el-footer><Footer></Footer></el-footer>
      </el-container>
    </el-container>
  </div>
</template>

<style>
  .el-header, .el-footer {
    color: #333;
    text-align: center;
    padding: 0 0 0 0;
  }

  .el-aside {
    color: #333;
    text-align: center;
  }

  .el-main {
    color: #333;
    text-align: center;
  }

  body > .el-container {
    margin-bottom: 40px;
  }

</style>

<script>
  import HeadWithPicture from '@/components/HeadWithPicture'
  import Navigation from '@/components/Navigation'
  import Jabbers from '@/components/catalog/Jabbers'
  import Footer from '@/components/Footer'
  export default {
    components:{
      HeadWithPicture:HeadWithPicture,
      Navigation:Navigation,
      Jabbers:Jabbers,
      Footer:Footer
    }
  }
</script>

