
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

object image extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.6*/(url : String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<img src="""),_display_(/*3.15*/url),format.raw/*3.18*/(""" """),format.raw/*3.19*/("""/>

    






   
"""))
      }
    }
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 09 16:21:53 CEST 2019
                  SOURCE: C:/Users/HP/Desktop/dlp-test/app/views/image.scala.html
                  HASH: 756ddd7aed4717abea2ed0575c8b2e17eadc5e75
                  MATRIX: 948->7|1058->22|1090->28|1126->38|1149->41|1177->42
                  LINES: 28->2|33->2|34->3|34->3|34->3|34->3
                  -- GENERATED --
              */
          