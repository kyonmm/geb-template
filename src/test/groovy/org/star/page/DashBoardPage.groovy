package org.star.page

import geb.Page

class DashBoardPage extends Page{
    static url = "home"
    static at = {
        $("h1").text() == "Dash Board"
    }

    static content = {
    }
}
