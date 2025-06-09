const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmo4419/",
            name: "ssmo4419",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmo4419/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "餐饮掌上设备点餐系统"
        } 
    }
}
export default base
