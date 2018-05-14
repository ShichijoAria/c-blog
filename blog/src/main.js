// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import 'element-ui/lib/theme-chalk/display.css';
import axios from 'axios'
import VueAxios from 'vue-axios'
import VueParticles from 'vue-particles'
import './assets/iconfont'
import IconSVG from '@/components/IconSVG'

Vue.component('iconSVG', IconSVG)
Vue.use(VueParticles)
Vue.use(VueAxios, axios)
Vue.use(ElementUI);
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
