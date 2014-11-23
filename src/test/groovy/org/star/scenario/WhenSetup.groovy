package org.star.scenario

import geb.spock.GebReportingSpec
import org.star.page.*

/**
 * アプリケーションをデプロイ後に利用し始めるときの環境構築を定義する
 */
class WhenSetup extends GebReportingSpec {

    // 安全のために管理者は削除できなくなっている
    def "追加されたユーザはユーザ管理できないし、管理者は管理者アカウントを削除できない"(){
        given: "トップページにアクセスする"
        to TopPage
        when: "管理者としてログインすると"
        login "admin", "admin"
        then: "ダッシュボード画面が表示される"
        at DashBoardPage
    }

}
