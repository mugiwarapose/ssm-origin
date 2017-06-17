/**
 * Created by pose on 2017/6/12.
 */
if(typeof (MyUtils)==null){

    MyUtils = {
        pageScroll:function () {
            
        },
        getObj:function (obj) {
            if(typeof arguments[0]=='string'){
                return $('#obj');
            }
            if(typeof arguments[0] =='object' ){
                return obj;
            }
            return null;
        },
        isNotEmpty:function (val) {
            if(val==null || val==='' || typeof (val) =='undefined'){
                return false;
            }
            return true;
        },
        isEmpty:function (val) {
            if(val==null || val==='' || typeof (val) =='undefined'){
                return true;
            }
            return false;
        }
    }

}