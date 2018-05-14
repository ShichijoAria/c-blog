<template>
  <div id="my-head">
    <div id="background" :style="bkg">
      <el-row type="flex" justify="center">
        <el-col :xs="10" :sm="6" :md="5" :lg="3" :xl="2" >
          <img id="img" :src=srcValue>
          <el-tag type="info" color="black">Aria</el-tag>
          <div style="color: white">如果学习是一件痛苦的事情，我愿意成为抖M</div>
        </el-col>
      </el-row>
    </div>
    <vue-particles color="#dedede"
                   :particleOpacity="0.7"
                   :particlesNumber="150"
                   shapeType="circle"
                   :particleSize="2"
                   linesColor="#dedede"
                   :linesWidth="1"
                   :lineLinked="true"
                   :lineOpacity="0.1"
                   :linesDistance="75"
                   :moveSpeed="2"
                   :hoverEffect="true"
                   hoverMode="grab"
                   :clickEffect="true"
                   clickMode="repulse"
                   :style="note"></vue-particles>
  </div>
</template>

<style>
  #img{
    margin-top: 75px;
    width: 100%;
    border-radius: 50%;
    z-index: 2;
  }
  #background{

  }
</style>


<script>
  import picture from './../assets/logo.png'
  import bckgrd from './../assets/background.jpg'

  export default {
    data(){
      return{
        srcValue:picture,
        note:{
          height: '400px',
          position: 'absolute',
          top: '0px',
          zIndex:'3',
          width: '100%',
        },
        bkg:{
          height: '400px',
          width:'100%',
          zIndex:'2',
          backgroundImage:  "url(" +bckgrd+")",
          backgroundSize:'cover'
        }
      }
    }
  }
</script>
