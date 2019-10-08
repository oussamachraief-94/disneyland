
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object images extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[ImageMap],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(list: List[ImageMap]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<ul>
"""),_display_(/*3.2*/for(index <- 0 until list.size) yield /*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
"""),format.raw/*4.1*/("""<li>
<img width="100" height="100" src="""),_display_(/*5.36*/list/*5.40*/.get(index).getDownload_url()),format.raw/*5.69*/(""" """),format.raw/*5.70*/("""></img>
</li>
""")))}),format.raw/*7.2*/("""



"""),format.raw/*11.1*/("""</ul>"""))
      }
    }
  }

  def render(list:List[ImageMap]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[ImageMap]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 08 17:09:58 CEST 2019
                  SOURCE: C:/Users/HP/Desktop/dlp-test/app/views/images.scala.html
                  HASH: 239dddb2ce0981b9522e41944fdc4438387e3f7c
                  MATRIX: 957->1|1074->23|1102->25|1134->32|1180->63|1219->65|1247->67|1314->108|1326->112|1375->141|1403->142|1449->159|1484->167
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|39->7|43->11
                  -- GENERATED --
              */
          