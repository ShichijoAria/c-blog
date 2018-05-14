<template>
  <div>
    <el-row>
      <el-col :span="4" class="projectName">Yorha Blog管理系统</el-col>
      <el-col :span="4" :offset="16">
        <el-dropdown @command="handleCommand">
          <span class="el-dropdown-link">
            aria<i class="el-icon-arrow-down el-icon--right"></i>
          </span>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item command="a">注销</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </el-col>
    </el-row>
  </div>
</template>

<script>
    export default {
      methods: {
        handleCommand(command) {
          this.$message('click on item ' + command);
        }
      }
    }
</script>

<style scoped>
  .projectName{
    font-weight: bolder;
    font-size: 20px;
  }
  .el-dropdown-link {
    cursor: pointer;
    color: #409EFF;
  }
  .el-icon-arrow-down {
    font-size: 12px;
  }
</style>
