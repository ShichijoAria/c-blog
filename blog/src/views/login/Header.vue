<template>
  <div>
    <el-row>
      <el-col :span="4" :offset="4" class="projectName">YorhaBlog</el-col>
      <el-col :span="4" :offset="12">
        <iconSVG iconStyle="iconStyle" icon-class="emoji"></iconSVG>
      </el-col>
    </el-row>
  </div>
</template>

<script>
  export default {
    methods: {

    }
  }
</script>

<style scoped>
  .projectName{
    font-weight: bolder;
    font-size: 20px;
  }
  .iconStyle{
    width: 2em;
    height: 2em;
    vertical-align: -0.5em;
    fill: #bfcbd9;
    overflow: hidden;
  }
</style>
