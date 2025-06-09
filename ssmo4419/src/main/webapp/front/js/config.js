
var projectName = '餐饮掌上设备点餐系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '餐饮店',
	url: './pages/canyindian/list.html'
}, 
{
	name: '菜品信息',
	url: './pages/caipinxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssmo4419/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"餐饮店","menuJump":"列表","tableName":"canyindian"}],"menu":"餐饮店管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"菜系","menuJump":"列表","tableName":"caixi"}],"menu":"菜系管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"餐桌","menuJump":"列表","tableName":"canzhuo"}],"menu":"餐桌管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["查看","修改","删除","导出"],"menu":"我的订单","menuJump":"列表","tableName":"wodedingdan"}],"menu":"我的订单管理"},{"child":[{"buttons":["查看","修改","删除","导出"],"menu":"退单信息","menuJump":"列表","tableName":"tuidanxinxi"}],"menu":"退单信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"餐桌状态","menuJump":"列表","tableName":"canzhuozhuangtai"}],"menu":"餐桌状态管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"销售统计","menuJump":"列表","tableName":"xiaoshoutongji"}],"menu":"销售统计管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"加盟申请","menuJump":"列表","tableName":"jiamengshenqing"}],"menu":"加盟申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请加盟"],"menu":"餐饮店列表","menuJump":"列表","tableName":"canyindian"}],"menu":"餐饮店模块"},{"child":[{"buttons":["查看","下单"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","申请加盟"],"menu":"餐饮店","menuJump":"列表","tableName":"canyindian"}],"menu":"餐饮店管理"},{"child":[{"buttons":["查看","下单"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["查看","修改","支付","导出","退单"],"menu":"我的订单","menuJump":"列表","tableName":"wodedingdan"}],"menu":"我的订单管理"},{"child":[{"buttons":["查看","修改","导出"],"menu":"退单信息","menuJump":"列表","tableName":"tuidanxinxi"}],"menu":"退单信息管理"},{"child":[{"buttons":["查看"],"menu":"加盟申请","menuJump":"列表","tableName":"jiamengshenqing"}],"menu":"加盟申请管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请加盟"],"menu":"餐饮店列表","menuJump":"列表","tableName":"canyindian"}],"menu":"餐饮店模块"},{"child":[{"buttons":["查看","下单"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"菜系","menuJump":"列表","tableName":"caixi"}],"menu":"菜系管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"餐桌","menuJump":"列表","tableName":"canzhuo"}],"menu":"餐桌管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["查看","修改","删除","审核","导出"],"menu":"我的订单","menuJump":"列表","tableName":"wodedingdan"}],"menu":"我的订单管理"},{"child":[{"buttons":["查看","修改","删除","审核","导出"],"menu":"退单信息","menuJump":"列表","tableName":"tuidanxinxi"}],"menu":"退单信息管理"},{"child":[{"buttons":["查看"],"menu":"餐桌状态","menuJump":"列表","tableName":"canzhuozhuangtai"}],"menu":"餐桌状态管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"销售统计","menuJump":"列表","tableName":"xiaoshoutongji"}],"menu":"销售统计管理"},{"child":[{"buttons":["查看","审核","删除"],"menu":"加盟申请","menuJump":"列表","tableName":"jiamengshenqing"}],"menu":"加盟申请管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请加盟"],"menu":"餐饮店列表","menuJump":"列表","tableName":"canyindian"}],"menu":"餐饮店模块"},{"child":[{"buttons":["查看","下单"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"餐饮店","tableName":"canyindian"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"餐桌状态","menuJump":"列表","tableName":"canzhuozhuangtai"}],"menu":"餐桌状态管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请加盟"],"menu":"餐饮店列表","menuJump":"列表","tableName":"canyindian"}],"menu":"餐饮店模块"},{"child":[{"buttons":["查看","下单"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
