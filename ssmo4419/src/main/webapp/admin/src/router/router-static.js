import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import canyindian from '@/views/modules/canyindian/list'
    import tuidanxinxi from '@/views/modules/tuidanxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import canzhuozhuangtai from '@/views/modules/canzhuozhuangtai/list'
    import xiaoshoutongji from '@/views/modules/xiaoshoutongji/list'
    import wodedingdan from '@/views/modules/wodedingdan/list'
    import jiamengshenqing from '@/views/modules/jiamengshenqing/list'
    import caixi from '@/views/modules/caixi/list'
    import caipinxinxi from '@/views/modules/caipinxinxi/list'
    import config from '@/views/modules/config/list'
    import canzhuo from '@/views/modules/canzhuo/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/canyindian',
        name: '餐饮店',
        component: canyindian
      }
      ,{
	path: '/tuidanxinxi',
        name: '退单信息',
        component: tuidanxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/canzhuozhuangtai',
        name: '餐桌状态',
        component: canzhuozhuangtai
      }
      ,{
	path: '/xiaoshoutongji',
        name: '销售统计',
        component: xiaoshoutongji
      }
      ,{
	path: '/wodedingdan',
        name: '我的订单',
        component: wodedingdan
      }
      ,{
	path: '/jiamengshenqing',
        name: '加盟申请',
        component: jiamengshenqing
      }
      ,{
	path: '/caixi',
        name: '菜系',
        component: caixi
      }
      ,{
	path: '/caipinxinxi',
        name: '菜品信息',
        component: caipinxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/canzhuo',
        name: '餐桌',
        component: canzhuo
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
