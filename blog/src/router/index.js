import Vue from 'vue'
import Router from 'vue-router'
import Layout from '@/components/Layout.vue'
import AdminLayout from '@/views/admin/Layout.vue'
import Login from '@/views/login/Layout.vue'

Vue.use(Router)

export default new Router({
  mode:'history',
  routes: [
    {
      path: '/',
      name: 'Layout',
      component: Layout
    },
    {
      path: '/admin',
      name: 'AdminLayout',
      component: AdminLayout
    },
    ,
    {
      path: '/login_page',
      name: 'Login',
      component: Login
    }
  ]
})
