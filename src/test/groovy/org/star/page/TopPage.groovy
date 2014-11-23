package org.star.page

import geb.Page
import org.star.module.NotLoginHeaderModule

class TopPage extends Page{
    static at = {
        $(id:"myCarousel")
    }
    static content = {
        header(required:true) {module NotLoginHeaderModule}
    }
    def login(username, password){
        header.name = username
        header.password = password
        header.login.click()
    }
}
