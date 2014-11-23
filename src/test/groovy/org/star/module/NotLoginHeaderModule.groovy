package org.star.module

import geb.Module

class NotLoginHeaderModule extends Module {
    static content = {
        name {$("input", name:"j_username")}
        password {$("input", name:"j_password")}
        login{
            $("input", value:"Login")
        }
    }
}
