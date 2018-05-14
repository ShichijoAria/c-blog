<template>
  <div>
    <el-row  type="flex" justify="center">
      <el-col :xs="24" :sm="20" :md="18" :lg="18" :xl="18">
        <el-menu :default-active="activeIndex" class="el-menu-vertical-demo" mode="horizontal" @select="handleSelect" text-color="black" menu-trigger="click">
          <el-menu-item index="1">主页</el-menu-item>
          <el-submenu index="2" disabled>
            <template slot="title">文章</template>
            <el-menu-item index="2-1">java</el-menu-item>
            <el-menu-item index="2-2">前端划水</el-menu-item>
            <el-submenu index="2-3">
              <template slot="title">考研心得</template>
              <el-menu-item index="2-3-1">数学</el-menu-item>
              <el-menu-item index="2-3-2">英语</el-menu-item>
            </el-submenu>
          </el-submenu>
          <el-menu-item index="3" disabled>随笔</el-menu-item>
          <el-menu-item index="4" disabled>思维导图</el-menu-item>
          <el-menu-item index="5">槽点</el-menu-item>
          <el-menu-item index="6" disabled>留言板</el-menu-item>
        </el-menu>
        <div class="line"></div>
        <keep-alive>
          <component v-bind:is="which_to_show"></component>
        </keep-alive>
      </el-col>
    </el-row>
  </div>
</template>


<script>
  import Jabbers from '@/components/catalog/Jabbers'
  import Minds from '@/components/catalog/Minds'
  export default {
    data() {
      return {
        activeIndex:"1",
        which_to_show: "Minds"
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        let obj={
          "4":"Minds",
          "5":"Jabbers"
        }
        this.which_to_show=obj[keyPath]
      }
    },
    components:{
      Jabbers:Jabbers,
      Minds:Minds
    }
  }
</script>
