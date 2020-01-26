/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author  
 */
@WebServlet(name="wyszukiwarka2", urlPatterns={"/wyszukiwarka2"})
public class wyszukiwarka2 extends HttpServlet {
 static final String nazwaserwera="localhost";
  static final String nazwabazy="sklep_online_gsm";
    static final String nazwauzytkownika="root";
    static final String haslobazy="krasnal";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }



    public void destroy() {

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
            response.setContentType("text/html; CHARSET=windows-1250");

String id_user= request.getParameter("id_user");
  String fraza= request.getParameter("fraza2");
   String pole= request.getParameter("pole");
    HttpSession session=request.getSession();




        try {
      Connection polaczenie;
      
  
         
                 Statement sql001;     Statement sql002;     Statement sql003;Statement sql004; Statement sql005;Statement sql008; Statement sql009;Statement sql0022;
      Statement sql37;Statement sql38;Statement sql39;Statement sql40;Statement sql0055;Statement sql0056;Statement sql00551;Statement sql00561;
      Statement sql; Statement sql0150; Statement sql090;
      Statement sql2;     Statement sql11;
      Statement sql9;  Statement sql10;Statement sql0051; Statement sql00555;
        Statement sql3;
      PrintWriter out = response.getWriter();

      Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
        sql001=polaczenie.createStatement(); sql002=polaczenie.createStatement();sql004=polaczenie.createStatement();sql005=polaczenie.createStatement(); sql003=polaczenie.createStatement();sql008=polaczenie.createStatement();sql009=polaczenie.createStatement();
       sql37=polaczenie.createStatement(); sql38=polaczenie.createStatement(); sql39=polaczenie.createStatement();sql40=polaczenie.createStatement();
      sql=polaczenie.createStatement();sql0056=polaczenie.createStatement();sql0055=polaczenie.createStatement();
      sql2=polaczenie.createStatement();sql00561=polaczenie.createStatement();sql00551=polaczenie.createStatement();
      sql9=polaczenie.createStatement();sql0150=polaczenie.createStatement();sql090=polaczenie.createStatement();
sql10=polaczenie.createStatement();sql11=polaczenie.createStatement();
         sql3=polaczenie.createStatement();    sql0051=polaczenie.createStatement(); sql00555=polaczenie.createStatement();
         
         sql0022=polaczenie.createStatement();
         
         
         
         
         
         
         
         
         
 out.write("<!DOCTYPE html>\n" +

"<!doctype html>\n" +
"<html lang=\"pl\">\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-2\" />\n" +
"<meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n" +
"<title>Sklep online - akcesoria GSM</title>\n" +
"<meta name=\"keywords\" content=\"\">\n" +
"<link rel=\"canonical\" href=\"20-gaming-console\">\n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"\n" +
"<link href=\"https@fonts.googleapis.com/css@family=Poppins_3A300,400,500,600,700\" rel=\"stylesheet\">\n" +
"<link rel=\"stylesheet\" href=\"themes/ecmart/assets/css/theme.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/psblog/views/css/psblog.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/psblog/views/css/lightbox.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/psproductcountdown/views/css/psproductcountdown.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/psproductcountdown/views/css/themes/1.7/1-simple.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/productcomments/productcomments.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"js/jquery/ui/themes/base/minified/jquery-ui.min.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"js/jquery/ui/themes/base/minified/jquery.ui.theme.min.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"js/jquery/plugins/fancybox/jquery.fancybox.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_offercmsblock/views/css/pst_offercmsblock.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_verticalmenu/views/css/pst_verticalmenu.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/stproductsearch/css/stsearch.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/stproductsearch/css/jquery.autocomplete_productsearch.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_bannercmsblock/views/css/pst_bannercmsblock.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_serviceblock/views/css/pst_serviceblock.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_categorycmsblock/views/css/pst_categorycmsblock.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_categoryslider/views/css/pst_categoryslider.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_paymentcmsblock/views/css/pst_paymentcmsblock.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_imageslider/views/css/flexslider.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"modules/pst_blocktopcontact/views/css/pst_blocktopcontact.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"themes/ecmart/assets/css/font-awesome.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"themes/ecmart/assets/css/owl.transitions.css\" type=\"text/css\" media=\"all\">\n" +
"  <link rel=\"stylesheet\" href=\"themes/ecmart/assets/css/custom.css\" type=\"text/css\" media=\"all\">\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"  \n" +
"\n" +
"  <script type=\"text/javascript\">\n" +
"        var ajaxsearch = \"1\";\n" +
"        var prestashop = {\"cart\":{\"products\":[],\"totals\":{\"total\":{\"type\":\"total\",\"label\":\"Total\",\"amount\":0,\"value\":\"\\u20ac0.00\"},\"total_including_tax\":{\"type\":\"total\",\"label\":\"Total (tax incl.)\",\"amount\":0,\"value\":\"\\u20ac0.00\"},\"total_excluding_tax\":{\"type\":\"total\",\"label\":\"Total (tax excl.)\",\"amount\":0,\"value\":\"\\u20ac0.00\"}},\"subtotals\":{\"products\":{\"type\":\"products\",\"label\":\"Subtotal\",\"amount\":0,\"value\":\"\\u20ac0.00\"},\"discounts\":null,\"shipping\":{\"type\":\"shipping\",\"label\":\"Shipping\",\"amount\":0,\"value\":\"Free\"},\"tax\":{\"type\":\"tax\",\"label\":\"Taxes\",\"amount\":0,\"value\":\"\\u20ac0.00\"}},\"products_count\":0,\"summary_string\":\"0 items\",\"vouchers\":{\"allowed\":0,\"added\":[]},\"discounts\":[],\"minimalPurchase\":0,\"minimalPurchaseRequired\":\"\"},\"currency\":{\"name\":\"Euro\",\"iso_code\":\"EUR\",\"iso_code_num\":\"978\",\"sign\":\"\\u20ac\"},\"customer\":{\"lastname\":null,\"firstname\":null,\"email\":null,\"birthday\":null,\"newsletter\":null,\"newsletter_date_add\":null,\"optin\":null,\"website\":null,\"company\":null,\"siret\":null,\"ape\":null,\"is_logged\":false,\"gender\":{\"type\":null,\"name\":null},\"addresses\":[]},\"language\":{\"name\":\"English (English)\",\"iso_code\":\"en\",\"locale\":\"en-US\",\"language_code\":\"en-us\",\"is_rtl\":\"0\",\"date_format_lite\":\"m\\/d\\/Y\",\"date_format_full\":\"m\\/d\\/Y H:i:s\",\"id\":1},\"page\":{\"title\":\"\",\"canonical\":\"20-gaming-console\",\"meta\":{\"title\":\"gaming console\",\"description\":\"tempor sed do incididunt consectetur eiusmod adipiscing elit, Lorem ipsum dolor sit amet, ut labore et dolore magna aliqua. Ut enim ad minim veniam,anim id est laborum quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit\",\"keywords\":\"\",\"robots\":\"index\"},\"page_name\":\"category\",\"body_classes\":{\"lang-en\":true,\"lang-rtl\":false,\"country-US\":true,\"currency-EUR\":true,\"layout-left-column\":true,\"page-category\":true,\"tax-display-disabled\":true,\"category-id-20\":true,\"category-gaming console\":true,\"category-id-parent-2\":true,\"category-depth-level-2\":true},\"admin_notifications\":[]},\"shop\":{\"name\":\"Ecmart Electronics Store\",\"logo\":\"img/demo-store-logo-1547639823.jpg\",\"stores_icon\":\"img/logo_stores.png\",\"favicon\":\"img/favicon.ico\"},\"urls\":{\"base_url\":\"default.htm\",\"current_url\":\"20-gaming-console\",\"shop_domain_url\":\"default.htm\",\"img_ps_url\":\"img/default.htm\",\"img_cat_url\":\"img/c/default.htm\",\"img_lang_url\":\"img/l/default.htm\",\"img_prod_url\":\"img/p/default.htm\",\"img_manu_url\":\"img/m/default.htm\",\"img_sup_url\":\"img/su/default.htm\",\"img_ship_url\":\"img/s/default.htm\",\"img_store_url\":\"img/st/default.htm\",\"img_col_url\":\"img/co/default.htm\",\"img_url\":\"themes/ecmart/assets/img/default.htm\",\"css_url\":\"themes/ecmart/assets/css/default.htm\",\"js_url\":\"themes/ecmart/assets/js/default.htm\",\"pic_url\":\"upload/default.htm\",\"pages\":{\"address\":\"address\",\"addresses\":\"addresses\",\"authentication\":\"login\",\"cart\":\"cart\",\"category\":\"index.php@controller=category\",\"cms\":\"index.php@controller=cms\",\"contact\":\"contact-us\",\"discount\":\"discount\",\"guest_tracking\":\"guest-tracking\",\"history\":\"order-history\",\"identity\":\"identity\",\"index\":\"default.htm\",\"my_account\":\"my-account\",\"order_confirmation\":\"order-confirmation\",\"order_detail\":\"index.php@controller=order-detail\",\"order_follow\":\"order-follow\",\"order\":\"order\",\"order_return\":\"index.php@controller=order-return\",\"order_slip\":\"credit-slip\",\"pagenotfound\":\"page-not-found\",\"password\":\"password-recovery\",\"pdf_invoice\":\"index.php@controller=pdf-invoice\",\"pdf_order_return\":\"index.php@controller=pdf-order-return\",\"pdf_order_slip\":\"index.php@controller=pdf-order-slip\",\"prices_drop\":\"prices-drop\",\"product\":\"index.php@controller=product\",\"search\":\"search\",\"sitemap\":\"sitemap\",\"stores\":\"stores\",\"supplier\":\"supplier\",\"register\":\"login@create_account=1\",\"order_login\":\"order@login=1\"},\"alternative_langs\":{\"en-us\":\"20-gaming-console\",\"ar-sa\":\"ar/20-gaming-console\",\"es-es\":\"es/20-gaming-console\",\"fr-fr\":\"fr/20-gaming-console\",\"de-de\":\"de/20-gaming-console\",\"it-it\":\"it/20-gaming-console\"},\"theme_assets\":\"\\/prestashop\\/PRS01\\/PRS0100029\\/themes\\/ecmart\\/assets\\/\",\"actions\":{\"logout\":\"@mylogout=\"},\"no_picture_image\":{\"bySize\":{\"cart_default\":{\"url\":\"img/p/en-default-cart_default.jpg\",\"width\":74,\"height\":90},\"small_default\":{\"url\":\"img/p/en-default-small_default.jpg\",\"width\":74,\"height\":90},\"medium_default\":{\"url\":\"img/p/en-default-medium_default.jpg\",\"width\":270,\"height\":330},\"home_default\":{\"url\":\"img/p/en-default-home_default.jpg\",\"width\":270,\"height\":330},\"large_default\":{\"url\":\"img/p/en-default-large_default.jpg\",\"width\":565,\"height\":691}},\"small\":{\"url\":\"img/p/en-default-cart_default.jpg\",\"width\":74,\"height\":90},\"medium\":{\"url\":\"img/p/en-default-medium_default.jpg\",\"width\":270,\"height\":330},\"large\":{\"url\":\"img/p/en-default-large_default.jpg\",\"width\":565,\"height\":691},\"legend\":\"\"}},\"configuration\":{\"display_taxes_label\":false,\"is_catalog\":false,\"show_prices\":true,\"opt_in\":{\"partner\":true},\"quantity_discount\":{\"type\":\"discount\",\"label\":\"Discount\"},\"voucher_enabled\":0,\"return_enabled\":0},\"field_required\":[],\"breadcrumb\":{\"links\":[{\"title\":\"Home\",\"url\":\"default.htm\"},{\"title\":\"gaming console\",\"url\":\"20-gaming-console\"}],\"count\":2},\"link\":{\"protocol_link\":\"https@/default.htm\",\"protocol_content\":\"https@/default.htm\"},\"time\":1561195674,\"static_token\":\"b9b242d817d88f7924697f6afc016c81\",\"token\":\"42b96055ef7e5c7de6525bb6962e6a09\"};\n" +
"        var st_search_url = \"module/stproductsearch/productsearch\";\n" +
"      </script>\n" +
"\n" +
"\n" +
"\n" +
"  <!-- module psproductcountdown start -->\n" +
"<script type=\"text/javascript\">\n" +
"            var pspc_labels = ['weeks', 'days', 'hours', 'minutes', 'seconds'];\n" +
"        var pspc_labels_lang = {\n" +
"            'weeks': 'weeks',\n" +
"            'days': 'days',\n" +
"            'hours': 'hours',\n" +
"            'minutes': 'minutes',\n" +
"            'seconds': 'seconds'\n" +
"        };\n" +
"        var pspc_show_weeks = 1;\n" +
"    var pspc_psv = 1.7;\n" +
"</script>\n" +
"");



       out.write(" <script>\n");
 out.write("function przetwarzajj_dane (){\n");
      out.write("  var brakuje_danych = false;\n");
      out.write("  var formularz = document.forms[2];\n");
      out.write("  var napis = \"\";\n");
      out.write("  \n");

     
                
      out.write("    if (formularz.kategoria.value== \"Kategoria...\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nie podano nazwy kategorii\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write(" \n");
      
      
      
      out.write("\n");
      out.write("  if (!brakuje_danych)\n");
      out.write("    return true;\n");
      out.write("  else{\n");
      out.write("    alert (\"W formularzu sa nastepujace bledy:\\n\" + napis);\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      

      out.write("</script>\n");

      
      out.write("</head>\n");
      out.write("\n");
      
      
      out.write("<body id=\"category\" class=\"lang-en country-us currency-eur layout-left-column page-category tax-display-disabled category-id-20 category-gaming-console category-id-parent-2 category-depth-level-2\">\n" +
"<main>\n" +
"<header id=\"header\">\n" +
"<div class=\"header-banner\">\n" +
" </div>\n" +
"<nav class=\"header-nav\">\n" +
" <div class=\"container\">\n" +
"      <div class=\"nav-inner\">  \n" +
"		<div class=\"hidden-md-down\">\n" +
"			<div class=\"left-nav\">\n" +
"				 \n" +
"<div id=\"pstblocktopcontact\" class=\"hidden-md-down\">\n" +
"\n" +
"		\n" +
"   <ul>\n" +
"		<li class=\"pst-contact-item\">\n" +
"		    <div class=\"contact-details\"><i class=\"fa fa-volume-control-phone\"></i> <span class=\"contact-title\">\n" +
"			<span class=\"contact-text\">Telefon:</span>555 - 555 - 555</span></div>\n" +
"		</li>\n" +
"        <li class=\"pst-contact-item\">\n" +
"         <div class=\"contact-details\"><i class=\"fa fa-envelope\"></i> <span class=\"contact-title\">sklep@online.com</span></div>\n" +
"      </li>\n" +
"      \n" +
"   </ul>\n" +
"\n" +
"</div>\n" +
"\n" +
"			</div>\n" +
"			\n" +
"\n" +
"		</div>\n" +
"		\n" +
"		<div class=\"hidden-lg-up text-xs-center mobile\">\n" +
"		 	<div class=\"float-xs-left vertical-menu\" id=\"menu-icon\">\n" +
"		        <i class=\"material-icons menu-open\">&#xE5D2;</i>\n" +
"				<i class=\"material-icons menu-close\">&#xE5CD;</i>\n" +
"				<span class=\"mainmenu-btn-wrapper\">\n" +
"					<span class=\"mainmenu-btn\"></span>\n" +
"				</span>				\n" +
"			</div>\n" +
"			<div class=\"float-xs-right\" id=\"_mobile_cart\"></div>\n" +
"			<div class=\"float-xs-right\" id=\"_mobile_search_widget\"></div>\n" +
"			<div class=\"float-xs-right\" id=\"_mobile_user_info\"></div>\n" +
"			<div class=\"top-logo\" id=\"_mobile_logo\"></div>\n" +
"			<div class=\"clearfix\"></div>\n" +
"		</div>\n" +
"      </div>\n" +
"	    </div>\n" +
"</nav>\n" +
"\n" +
"\n" +
"\n" +
"	<div class=\"header-top\">\n" +
"	 <div class=\"container\">\n" +
"			\n" +
"			<div class=\"header_logo hidden-md-down\" id=\"_desktop_logo\">\n" +
"				<a href=\"default.htm\">\n" +
"				<img class=\"logo img-responsive\" src=\"img/demo-store-logo-1547639823.jpg\" alt=\"sklep\">\n" +
"				</a>\n" +
"			</div>\n" +
"			\n" +
"\n" +
"<div class=\"menu pst-top-menu col-md-12 col-lg-12  js-top-menu position-static hidden-md-down\" id=\"_desktop_top_menu\">	\n" +
"    	\n" +
"          <ul class=\"top-menu\" id=\"top-menu\" data-depth=\"0\">\n" +
"\n" +
"\n" +
" <li class=\"category  \" id=\"category-9\"> <a class=\"dropdown-item\" href=\"logowanie.jsp\" data-depth=\"0\" > Logowanie </a></li>\n" +
" <li class=\"category current\" id=\"category-20\"><a class=\"dropdown-item\" href=\"rejestracja.jsp\" data-depth=\"0\"> Rejestracja</a> </li>\n" +
"     \n" +
"     \n" +
"             \n" +
"      \n" +
"    			\n" +
"    <div class=\"clearfix\"></div>	\n" +
"</div>\n" +
"<div id=\"_desktop_cart\">\n" +
"  <div class=\"blockcart cart-preview inactive\" data-refresh-url=\"module/ps_shoppingcart/ajax\">\n" +
"    <div class=\"header blockcart-header dropdown js-dropdown\">\n" +
"		 \n" +
"			<a rel=\"nofollow\" href=\"cart@action=show\" class=\"cart-icon\"  data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> 							\n" +
"				<span class=\"cart-title\">Koszyk</span>\n" +
"				<span class=\"cart-products-count\">");

        
                  ResultSet rs00561 = sql00561.executeQuery("SELECT id_koszyk FROM koszyk WHERE id_user='"+id_user+"' and realizacja='0';");

                        if (rs00561.next())
                            {
                                if (rs00561.getString(1).compareTo("")!=0)
                                  {
            
                    
                     ResultSet rs00551 = sql00551.executeQuery("SELECT sum(ilosc) FROM koszyk WHERE id_user='"+id_user+"' and realizacja='0';");

   while(rs00551.next())  { 
        out.write(" [ "+rs00551.getString(1)+" ] produktów ");
   }
                    
                    
           } }
      else
      {

       out.write("  [ 0 ] produktów ");


        }
        
        
        
        
        
out.write("</span>\n" +
"				<span class=\"cart-item-count\">				\n" +
"					<span class=\"cart-item\">0</span>			\n" +
"				</span>				\n" +
"			</a>\n" +
"		 \n" +
"		\n" +
"	      </div>\n" +
"  </div>\n" +
"</div>\n" +
"\n" +
"		\n" +
"			<div id=\"mobile_top_menu_wrapper\" class=\"row hidden-lg-up\" style=\"display:none;\">\n" +
"					<div class=\"js-top-menu mobile\" id=\"_mobile_top_menu\"></div>\n" +
"					<div class=\"js-top-menu mobile\" id=\"_mobile_vertical_menu\"></div>\n" +
"					<div class=\"js-top-menu-bottom\">				\n" +
"						<div id=\"_mobile_pst_categorycmsblock\"></div>		\n" +
"						<div id=\"_mobile_currency_selector\"></div>\n" +
"						<div id=\"_mobile_language_selector\"></div>\n" +
"						<div id=\"_mobile_contact_link\"></div>\n" +
"					</div>\n" +
"			</div>\n" +
"	\n" +
"	</div>\n" +
"	</div>	\n" +
"\n" +
"<div class=\"nav-bar\">\n" +
"  <div class=\"container\">\n" +
"  	\n" +
"\n" +
"<div class=\"vertical-menu js-top-menu position-static hidden-md-down\"  id=\"_desktop_vertical_menu\">\n" +
"		<div class=\"block-title\">\n" +
"		<div class=\"cat-title-wrapper\">\n" +
"			<div class=\"cat-title\">Kategorie produktów</div>\n" +
"	    </div>\n" +
"			<div class=\"title-arrow\"></div>\n" +
"		</div>\n" +
"        \n" +
"  <ul class=\"top-vertical-menu block_content\" id=\"top-vertical-menu\" data-depth=\"0\">\n" +
"");

              
              
              
      
      
      
              ResultSet rs002 = sql002.executeQuery("select nazwa,id_rodzaj from rodzaj order by nazwa;");

   while(rs002.next())  {
   
       
      out.write(" <li><a href=\"kategorie2?id_kategorie="+rs002.getString(2)+"&id_user="+request.getParameter("id_user")+"\">"+rs002.getString(1)+" </a></li>");
       
       
   }
      
      
            out.write("</ul>\n" +
"</div>\n" +
"<!-- Block search module -->\n" +
"<div id=\"_desktop_st_search_block_top\" class=\"block exclusive st_search_block_top\">\n" +
"	<!--<h4 class=\"title_block\">Search</h4>-->\n" +
"\n" +
"		    <!--	<label for=\"search_query_block\">Search products:</label>-->\n" +
"		<div class=\"block_content clearfix\">\n" +
"						\n" +
"			<div class=\"product_search\">\n" +
"                                 <form class=\"form-inline navbar-search\" method=\"post\" action=\"szukaj2\" >\n" +
"			<div class=\"list-cate-wrapper\">\n" +
"	\n" +
"                            \n" +
"                           \n" +
"			<input class=\"search_query form-control grey\" type=\"text\" name=\"fraza\" value=\"\" placeholder=\"Szukaj produktu..\" />");
 out.print("<input  type='hidden' name='id_user' value='"+request.getParameter("id_user")+"'>");
 out.print("			</div>\n" +
"			\n" +
"			<button type=\"submit\"  class=\"btn btn-default button button-small\">Szukaj</button> \n" +
"		 </form></div>\n" +
"	\n" +
"</div>\n" +
"<script type=\"text/javascript\">\n" +
"	var blocksearch_type = 'top';\n" +
"</script>\n" +
"<!-- /Block search module -->\n" +
"\n" +
"  </div>\n" +
"</div>        \n" +
"      </header>\n" +
"\n" +
"      \n" +
"        \n" +
"<aside id=\"notifications\">\n" +
"  <div class=\"container\">\n" +
"    \n" +
"    \n" +
"    \n" +
"      </div>\n" +
"</aside>\n" +
"      \n" +
"     \n" +
"\n" +
"		<div class=\"container\">	\n" +
"\n" +
"	 \n" +
"		\n" +
"\n" +
"	   \n" +
"\n" +
"	  	\n" +
"	  \n" +
"	  <section id=\"wrapper\">\n" +
"                 			 \n" +
"          <div id=\"columns_inner\">\n" +
"		  \n" +
"            <div id=\"left-column\" class=\"col-xs-12 col-sm-4 col-md-3 col-lg-3\">");

         
out.write("	<p><b>Witamy<strong> <font color=\"#990000\"> "+session.getAttribute("imie")+" "+session.getAttribute("nazwisko")+"</font> - KLIENT</strong></b></p>");         
         
         
         
      out.write("<div class=\"sidebar-featured block\">\n" +
"  <h4 class=\"block_title hidden-md-down\">Menu</h4>\n" +
"  <h4 class=\"block_title hidden-lg-up\" data-target=\"#block_featured_toggle\" data-toggle=\"collapse\">Menu \n" +
"    <span class=\"float-xs-right\">\n" +
"      <span class=\"navbar-toggler collapse-icons\">\n" +
"      <i class=\"material-icons add\">&#xE313;</i>\n" +
"      <i class=\"material-icons remove\">&#xE316;</i>\n" +
"      </span>\n" +
"    </span>\n" +
"  </h4>\n" +
" <div class=\"block_content collapse\" id=\"block_featured_toggle\"> \n" +
"  <div class=\"products clearfix\">\n" +
"        <div class=\"product-item\">\n" +
"     <ul class=\"category-top-menu\">");
              
              
      out.write("   <li ><a  href=\"koszyk?id_user="+request.getParameter("id_user")+"\">Koszyk</a></li>\n" +
"<li><a href=\"zamowienie?id_user="+request.getParameter("id_user")+"\">Status zamówie&#324;</a></li>\n" +
"<li ><a  href=\"wyszukiwarka?id_user="+request.getParameter("id_user")+"\">Wyszukiwarka</a></li>\n" +
"<li ><a  href=\"zmiana.jsp?id_user="+request.getParameter("id_user")+"\">Zmiana danych</a></li>\n" +
"<li  ><a href=\"logaut\">Wyloguj</a></li></ul>\n");
              
              
              
              
              
              
 out.write("</ul>\n" +
"\n" +
"    </div>\n" +
"\n" +
"\n" +
"      </div>\n" +
"\n" +
"  </div>\n" +
"</div>");  
         
         
         
         
         
out.write("<div class=\"block-categories block\">\n" +
"   <h4 class=\"block_title hidden-md-down\">\n" +
"   		<a href=\"20-gaming-console\">Menu kategorii</a>\n" +
"   </h4>\n" +
"   <h4 class=\"block_title hidden-lg-up\" data-target=\"#block_categories_toggle\" data-toggle=\"collapse\">\n" +
"		<a href=\"20-gaming-console\">Menu kategorii</a>\n" +
"		<span class=\"float-xs-right\">\n" +
"		  <span class=\"navbar-toggler collapse-icons\">\n" +
"			<i class=\"material-icons add\">&#xE313;</i>\n" +
"			<i class=\"material-icons remove\">&#xE316;</i>\n" +
"		  </span>\n" +
"		</span>\n" +
"	</h4>\n" +
"   <div id=\"block_categories_toggle\" class=\"block_content collapse\">\n" +
"	   <ul class=\"category-top-menu\">");
      
      
      
        
              ResultSet rs0022 = sql0022.executeQuery("select nazwa,id_rodzaj from rodzaj order by nazwa;");

while(rs0022.next())  
{
 
       
out.write(" <li><a href=\"kategorie2?id_kategorie="+rs0022.getString(2)+"&id_user="+request.getParameter("id_user")+"\">"+rs0022.getString(1)+" </a></li>");
       
       
} 
      
      
      
      out.write(" </ul>\n" +
"  </div>\n" +
"</div>\n" +
"<div id=\"search_filters_wrapper\" class=\"hidden-md-down block\">\n" +
"  <div id=\"search_filter_controls\" class=\"hidden-lg-up\">\n" +
"      <span id=\"_mobile_search_filters_clear_all\"></span> \n" +
"      <button class=\"btn btn-secondary ok\">\n" +
"        <i class=\"material-icons\">&#xE876;</i>\n" +
"        OK\n" +
"      </button>\n" +
"  </div>\n" +
"\n" +
"\n" +
"</div>\n" +
"\n" +
"<div class=\"sidebar-featured block\">\n" +
"  <h4 class=\"block_title hidden-md-down\">Menu producentów</h4>\n" +
"  <h4 class=\"block_title hidden-lg-up\" data-target=\"#block_featured_toggle\" data-toggle=\"collapse\">Menu producentów\n" +
"    <span class=\"float-xs-right\">\n" +
"      <span class=\"navbar-toggler collapse-icons\">\n" +
"      <i class=\"material-icons add\">&#xE313;</i>\n" +
"      <i class=\"material-icons remove\">&#xE316;</i>\n" +
"      </span>\n" +
"    </span>\n" +
"  </h4>\n" +
" <div class=\"block_content collapse\" id=\"block_featured_toggle\"> \n" +
"  <div class=\"products clearfix\">\n" +
"        <div class=\"product-item\">\n" +
"     <ul class=\"category-top-menu\">");
      

    ResultSet rs003 = sql003.executeQuery("select typ,id_typ from typ order by typ;");
while(rs003.next())
{
    out.write(" <li><a href=\"producent2?id_producent="+rs003.getString(2)+"&id_user="+request.getParameter("id_user")+"\">"+rs003.getString(1)+" </a></li>");
}
out.write(" </ul>\n" +
"</div>\n" +
"</div>\n" +
"</div>\n" +
"</div>\n" +
"</div>\n" +
"<div id=\"content-wrapper\" class=\"left-column col-xs-12 col-sm-8 col-md-9 col-lg-9\">");
out.write("<section id=\"main\">\n" +
"\n" +
"    \n" +
"      \n" +
"<header class=\"page-header\">\n" +

"        </header>\n" +
"      \n" +
"    \n" +
"\n" +
"    \n" +
"      <section id=\"content\" class=\"page-content card card-block\">\n" +
"        \n" +
"        \n" +
"    \n" +
"      <section class=\"login-form\">");

        
        
      
      
      
      
           out.write("<section id=\"main\">");
 

         
out.write("<h3 class=\"subcategory-heading\">Szukaj produktu, podana fraza: <font color='red'> '"+fraza+"'</font></h3>");

           

    
        

out.write("   <section id=\"products\">\n" +
"      		<input type=\"hidden\" name=\"carturl\" id=\"carturl\" value=\"https://demos.thementic.com/prestashop/PRS01/PRS0100029/en/cart\">\n" +
"		<input type=\"hidden\" name=\"carttoken\" id=\"carttoken\" value=\"b9b242d817d88f7924697f6afc016c81\">\n" +
"        <div id=\"\">\n" +
"          \n" +
"            <div id=\"js-product-list-top\" class=\"row products-selection\">\n" +
"  \n" +
"  <div class=\"col-md-8 hidden-md-down total-products\">\n" +
"    <ul class=\"display hidden-xs grid_list\">\n" +
"		<li id=\"grid\"><a href=\"#\" title=\"Grid\">Grid</a></li>\n" +
"		<li id=\"list\"><a href=\"#\" title=\"List\">List</a></li>\n" +
"	</ul>\n" +
"	\n" +
"");

        
        
        
     out.write(   "      </div>\n" +
"  <div class=\"col-md-4 sort-select\">\n" +
"    <div class=\"row sort-by-row\">\n" +
"\n" +
"      \n" +


"      \n" +
"\n" +
"              <div class=\"col-sm-3 col-xs-4 hidden-lg-up filter-button\">\n" +
"          <button id=\"search_filter_toggler\" class=\"btn btn-secondary\">\n" +
"            Filter\n" +
"          </button>\n" +
"        </div>\n" +
"          </div>\n" +
"  </div>\n" +
"  <div class=\"col-sm-12 hidden-lg-up showing\">\n" +
"    Showing 1-12 of 19 item(s)\n" +
"  </div>\n" +
"</div>\n" +
"          \n" +
"        </div>\n" +
"\n" +
"        \n" +
"         \n" +
"\n" +
"\n" +
"          \n" +
"        \n" +
"\n" +
"        <div id=\"\">\n" +
"          \n" +
"            <div id=\"js-product-list\">\n" +
"	<div class=\"products row\">\n" +
"		<ul class=\"product_list grid gridcount\">");


                   
                   
                   
        

  ResultSet rs9 = sql9.executeQuery("Select magazyn.cena,magazyn.nazwa,magazyn.obraz,magazyn.id_magazyn,magazyn.id_magazyn,rodzaj.nazwa,rodzaj.nazwa,opis_towaru.opis from magazyn,rodzaj,opis_towaru where ("+pole+" like '%"+fraza+"%') and magazyn.aktywny='1' and magazyn.id_rodzaj=rodzaj.id_rodzaj  and magazyn.id_magazyn=opis_towaru.id_magazyn;");

                        if (rs9.next())
                            {
                                if (rs9.getString(1).compareTo("")!=0)
                                  {








                   ResultSet rs = sql.executeQuery("Select magazyn.cena,magazyn.nazwa,magazyn.obraz,magazyn.id_magazyn,magazyn.id_magazyn,rodzaj.nazwa,rodzaj.nazwa,opis_towaru.opis,opis_towaru.opis_skrocony from magazyn,rodzaj,opis_towaru where ("+pole+" like '%"+fraza+"%') and magazyn.aktywny='1' and magazyn.id_rodzaj=rodzaj.id_rodzaj and magazyn.id_magazyn=opis_towaru.id_magazyn;");


      while(rs.next())  {
         
         
         
            
         
            
                   
                   
                   
out.write("<li class=\"product_item col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xl-3\">			\n" +
"<div class=\"product-miniature js-product-miniature\" data-id-product=\"19\" data-id-product-attribute=\"0\" itemscope itemtype=\"http://schema.org/Product\">\n" +
"  <div class=\"thumbnail-container\">\n" +
"    <div class=\"image-block\">\n" +
"    \n" +
"      <a href=\"k_1_3?id_magazyn="+rs.getString(5)+"&id_user="+request.getParameter("id_user")+"\" class=\"thumbnail product-thumbnail\">\n" +
"<img class = \"primary-image\" src = \""+rs.getString(3)+"\">\n" +
"<img class=\"replace-2x img_hover img-responsive secondary-image\" src=\""+rs.getString(3)+"\" \n" +
" data-full-size-image-url=\""+rs.getString(3)+"\" alt=\"\" />\n" +
"</a>\n" +
"	  \n" +
"        <div class=\"product-actions\">\n" +
"            <a href=\"k_1_3?id_magazyn="+rs.getString(5)+"&id_user="+request.getParameter("id_user")+"\" class=\"btn btn-primary view-button\" title=\"View Detail\">                Zobacz więcej</a>\n" +
"           \n" +
"        </div>                                \n" +
"\n" +
"    </div>\n" +
"  \n" +
" </div>\n" +
"    \n" +
"    <div class=\"product-description\">\n" +
"<h3 class=\"h3 product-title\" itemprop=\"name\">\n" +
"<a href=\"k_1_3?id_magazyn="+rs.getString(5)+"&id_user="+request.getParameter("id_user")+"\" title=\"consectetur adipiscing\" title=\"consectetur adipiscing\">"+rs.getString(2)+"</a></h3>\n" +
"<div class=\"product-price-and-shipping\">\n" +
"<span itemprop=\"price\" class=\"price\">"+rs.getString(1)+" z&#322;</span>\n" +
" \n" +
"\n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"      <div class=\"comments_note\">\n" +
"            <div class=\"star_content clearfix\">\n" +
"                             \n" +
"                                    </div>\n" +
"        <span>%s Review(s)&nbsp</span>\n" +
"    </div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"product-detail\" itemprop=\"description\"><p>\""+rs.getString(9)+"\"</p></div>\n" +
"\n" +
"	\n" +
"</div>\n" +
"</li>");

                   
                   
                   
                   
                   
                   
                   
                   
              
        }



                       } }
      else
      {

         out.write("                	<br/><div class=\"alert alert-block alert-error fade in\">\n" +
"	\n" +
"<strong><center><<< BRAK DANYCH >>></center></strong> \n" +
"</div>");


        }
 
        
                        
                        
                   
       polaczenie.close();              
                   
                   
                   
                   
                   
                        

out.write("					</ul>\n" +
"	</div>\n" +

"	\n" +
"</div>\n" +
"          \n" +
"        </div>\n" +
"\n" +
"        <div id=\"js-product-list-bottom\">\n" +
"          \n" +
"            <div id=\"js-product-list-bottom\"></div>\n" +
"          \n" +
"        </div>\n" +
"\n" +
"          </section>\n" +
"\n" +
"  </section>\n" +
"\n" +
"   \n" +
"  </div>\n" +
"\n" +
"\n" +
"          \n" +
"		  </div>\n" +
"             \n" +
"      </section>\n" +
"	\n" +
"	\n" +
"	</div>	");

      
      
     
           
           
           
           
           
           
           
           
           
        
        
        
              
                   
      

        
        
        
    
                  out.write(" <footer id=\"footer\">\n" +
"        \n" +
"          <div class=\"footer-before\">\n" +
"\n" +
"	<div class=\"container\">	\n" +
"			\n" +
"				<div class=\"block_newsletter-wrapper\">\n" +
"<div class=\"footer-logo\"><!--<span class=\"footer-logo-img\">footer-logo</span>--></div>\n" +
"<div class=\"block_newsletter\"> 	\n" +
"    <div class=\"newsletter-title col-xs-12 col-sm-12 col-md-12 col-lg-7 \">\n" +
"       <span class=\"pst-newsletter-icon\"></span>\n" +
"		<div class=\"newsletter-details\">\n" +
"			<span class=\"title\">zapisz si&#281; do newslettera</span>\n" +
"						<span class=\"newsletter-desc\">Uzyskaj najlepsze porady i wiadomo&#347;ci dotycz&#261;ce produktów w naszym sklepie.</span>\n" +
"					</div>\n" +
"	</div>\n" +
"    <div class=\"newsletter-block col-xs-12 col-sm-12 col-md-12 col-lg-5\">\n" +
"      <form action=\"https://demos.thementic.com/prestashop/PRS01/PRS0100029/en/#footer\" method=\"post\">\n" +
"        <div class=\"row\">\n" +
"          <div class=\"col-xs-12 email-wrapper\">\n" +
"		  <div class=\"block_newsletter_inner\">                       \n" +
"              <input\n" +
"                name=\"email\"\n" +
"                type=\"text\"\n" +
"                value=\"\"\n" +
"                placeholder=\"Your email address\"\n" +
"              >          \n" +
"			<input\n" +
"              class=\"btn btn-primary float-xs-right\"\n" +
"              name=\"submitNewsletter\"\n" +
"              type=\"submit\"\n" +
"              value=\"Subscribe\"\n" +
"            >\n" +
"            <input\n" +
"              class=\"btn btn-primary ok-btn float-xs-right\"\n" +
"              name=\"submitNewsletter\"\n" +
"              type=\"submit\"\n" +
"              value=\"OK\"\n" +
"            >\n" +
"            <input type=\"hidden\" name=\"action\" value=\"0\">\n" +
"            <div class=\"clearfix\"></div>\n" +
"			<div class=\"col-xs-12 newsletter-alert\">\n" +
"												\n" +
"							</div>\n" +
"			</div>\n" +
"          </div>\n" +
"\n" +
"        </div>\n" +
"      </form>\n" +
"    </div>\n" +
"</div>\n" +
"</div>\n" +
"\n" +
"			\n" +
"	</div>\n" +
"		\n" +
"</div>\n" +
"<div class=\"footer-container\">\n" +
"  <div class=\"container\">\n" +
"      \n" +
"      <div class=\"block-contact col-md-3 col-lg-3 links wrapper\">\n" +
"  \n" +
"   		<h3 class=\"text-uppercase block-contact-title hidden-sm-down\"><a href=\"stores\">Informacje</a></h3>\n" +
"      \n" +
"		<div class=\"title clearfix hidden-md-up\" data-target=\"#block-contact_list\" data-toggle=\"collapse\">\n" +
"		  <span class=\"h3\">Informacje</span>\n" +
"		  <span class=\"float-xs-right\">\n" +
"			  <span class=\"navbar-toggler collapse-icons\">\n" +
"				<i class=\"material-icons add\">&#xE313;</i>\n" +
"				<i class=\"material-icons remove\">&#xE316;</i>\n" +
"			  </span>\n" +
"		  </span>\n" +
"		</div>\n" +
"	  \n" +
"	  <ul id=\"block-contact_list\" class=\"collapse\">\n" +
"  <li><div class=\"icon\"><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i></div><div class=\"data\">Ecmart Sklep Online<br />11-111 Warszawa, ul. Polna 134<br /></div></li>\n" +
"                          <li>\n" +
"        <div class=\"icon\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></div>\n" +
"        <div class=\"data\">\n" +
"                Email: <span>sklep@online.com</span>\n" +
"        </div>\n" +
"        </li>\n" +
"        </ul>\n" +
"\n" +
"  \n" +
"\n" +
"  <div class=\"block-social links\">\n" +
"	 <span class=\"h3 hidden-sm-down\">Social media</span>\n" +
"	 	<div class=\"title clearfix hidden-md-up\" data-target=\"#block-social_list\" data-toggle=\"collapse\">\n" +
"		  <span class=\"h3\">Social media</span>\n" +
"		  <span class=\"float-xs-right\">\n" +
"			  <span class=\"navbar-toggler collapse-icons\">\n" +
"				<i class=\"material-icons add\">&#xE313;</i>\n" +
"				<i class=\"material-icons remove\">&#xE316;</i>\n" +
"			  </span>\n" +
"		  </span>\n" +
"		</div>\n" +
"	 		\n" +
"	<ul id=\"block-social_list\" class=\"collapse\">\n" +
"              <li class=\"facebook\">\n" +
"		<div class=\"social-item-inner\">\n" +
"		<a href=\"#\" target=\"_self\">\n" +
"		<div class=\"social-right\">Facebook</div>\n" +
"		</a>\n" +
"		</div>\n" +
"		</li>\n" +
"              <li class=\"twitter\">\n" +
"		<div class=\"social-item-inner\">\n" +
"		<a href=\"#\" target=\"_self\">\n" +
"		<div class=\"social-right\">Twitter</div>\n" +
"		</a>\n" +
"		</div>\n" +
"		</li>\n" +
"              <li class=\"youtube\">\n" +
"		<div class=\"social-item-inner\">\n" +
"		<a href=\"#\" target=\"_self\">\n" +
"		<div class=\"social-right\">YouTube</div>\n" +
"		</a>\n" +
"		</div>\n" +
"		</li>\n" +
"              <li class=\"instagram\">\n" +
"		<div class=\"social-item-inner\">\n" +
"		<a href=\"#\" target=\"_self\">\n" +
"		<div class=\"social-right\">Instagram</div>\n" +
"		</a>\n" +
"		</div>\n" +
"		</li>\n" +
"          </ul>\n" +
"  </div>\n" +
"\n" +
"\n" +
"  \n" +
"</div>  <div class=\"col-md-12 col-lg-3 links block links\">\n" +
"    \n" +
"	   <h3 class=\"h3 hidden-sm-down\">Tagi</h3>\n" +
"            <div class=\"title block_title h3 clearfix hidden-md-up \" data-target=\"#footer_sub_menu_24227\" data-toggle=\"collapse\">\n" +
"	  \n" +
"        <span class=\"\">Tagi</span>\n" +
"        <span class=\"float-xs-right hidden-lg-up\">\n" +
"          <span class=\"navbar-toggler collapse-icons\">\n" +
"            <i class=\"material-icons add\">&#xE313;</i>\n" +
"            <i class=\"material-icons remove\">&#xE316;</i>\n" +
"          </span>\n" +
"        </span>\n" +
"      </div>\n" +
"      <ul id=\"footer_sub_menu_24227\" class=\"collapse block_content\">\n" +
"                  <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Sklep online</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Akcesoria GSM</a>\n" +
"          </li>\n" +
"                        <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Telefony komórkowe</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Telefony GSM</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Wszystko do telefonu</a>\n" +
"          </li>\n" +
"              </ul>\n" +
"    </div>\n" +
"  <div class=\"col-md-12 col-lg-3 links block links\">\n" +
"    \n" +
"	   <h3 class=\"h3 hidden-sm-down\">Tagi</h3>\n" +
"            <div class=\"title block_title h3 clearfix hidden-md-up \" data-target=\"#footer_sub_menu_56380\" data-toggle=\"collapse\">\n" +
"	  \n" +
"        <span class=\"\">Tagi</span>\n" +
"        <span class=\"float-xs-right hidden-lg-up\">\n" +
"          <span class=\"navbar-toggler collapse-icons\">\n" +
"            <i class=\"material-icons add\">&#xE313;</i>\n" +
"            <i class=\"material-icons remove\">&#xE316;</i>\n" +
"          </span>\n" +
"        </span>\n" +
"      </div>\n" +
"      <ul id=\"footer_sub_menu_56380\" class=\"collapse block_content\">\n" +
"                \n" +
"            \n" +
"                    <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Sklep online</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Akcesoria GSM</a>\n" +
"          </li>\n" +
"                        <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Telefony komórkowe</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Telefony GSM</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Wszystko do telefonu</a>\n" +
"          </li>\n" +
"              </ul>\n" +
"    </div>\n" +
"  <div class=\"col-md-12 col-lg-3 links block links\">\n" +
"    \n" +
"	   <h3 class=\"h3 hidden-sm-down\">Tagi</h3>\n" +
"            <div class=\"title block_title h3 clearfix hidden-md-up \" data-target=\"#footer_sub_menu_73977\" data-toggle=\"collapse\">\n" +
"	  \n" +
"        <span class=\"\">Tagi</span>\n" +
"        <span class=\"float-xs-right hidden-lg-up\">\n" +
"          <span class=\"navbar-toggler collapse-icons\">\n" +
"            <i class=\"material-icons add\">&#xE313;</i>\n" +
"            <i class=\"material-icons remove\">&#xE316;</i>\n" +
"          </span>\n" +
"        </span>\n" +
"      </div>\n" +
"      <ul id=\"footer_sub_menu_73977\" class=\"collapse block_content\">\n" +
"                  <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Sklep online</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Akcesoria GSM</a>\n" +
"          </li>\n" +
"                        <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Telefony komórkowe</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Telefony GSM</a>\n" +
"          </li>\n" +
"                         <li>\n" +
"            <a id=\"link-cms-page-1-1\" class=\"cms-page-link\" href=\"content/1-delivery\" title=\"Our terms and conditions of delivery\">Wszystko do telefonu</a>\n" +
"          </li>\n" +
"              </ul>\n" +
"    </div>\n" +
"  \n" +
"      	   	    \n" +
"  </div> \n" +
"  </div>\n" +
"	  <div class=\"footer-bottom\">\n" +
"	  <div class=\"container\">\n" +
"	  <div class=\"row\">\n" +
"      <div class=\"col-md-12 footer-after-wrapper\">	        \n" +
"		<div class=\"footer-after\">\n" +
"			<div class=\"copyright\">\n" +
"			\n" +
"			 <a class=\"_blank\" href=\"www.prestashop.com/default.htm\" target=\"_self\">\n" +
"               2019 - Sklep online - akcesoria GSM\n" +
"			</a>\n" +
"			\n" +
"			</div>\n" +
"			\n" +
"			<div class=\"footer-logo\">\n" +
"			<span class=\"footer-logo-img\">footer-logo</span>\n" +
"			</div>\n" +
"			\n" +
"			\n" +
"			\n" +
"			\n" +
"				<div id=\"pstpaymentcmsblock\">\n" +
"<div class=\"payment-block\">	\n" +
"<!--<span class=\"h3\">payment method</span>-->\n" +

"<ul class=\"payment-block-inner\">\n" +
"	<li class=\"visa icon\"><a href=\"#\"><img src=\"modules/pst_paymentcmsblock/views/img/visa.png\" alt=\"\" /></a></li>\n" +
"	<li class=\"paypal icon\"><a href=\"#\"><img src=\"modules/pst_paymentcmsblock/views/img/paypal.png\" alt=\"\" /></a></li>\n" +
"	<li class=\"discover icon\"><a href=\"#\"><img src=\"modules/pst_paymentcmsblock/views/img/discover.png\" alt=\"\" /></a></li>\n" +
"	<li class=\"mastercard icon\"><a href=\"#\"><img src=\"modules/pst_paymentcmsblock/views/img/mastercard.png\" alt=\"\" /></a></li>\n" +
"	<li class=\"american-express icon\"><a href=\"#\"><img src=\"modules/pst_paymentcmsblock/views/img/american-express.png\" alt=\"\" /></a></li>\n" +
"</ul>\n" +
"		</div>	\n" +
"</div>\n" +
"\n" +
"			\n" +
"		</div>\n" +
"      </div>\n" +
"	  </div>\n" +
"	  </div>\n" +
"	  </div>\n" +
"\n" +
"<script type=\"text/javascript\" src=\"https@themera.net/embed/themera.js@id=30408\"></script>        \n" +
"      </footer>\n" +
"\n" +
"    </main>\n" +
"\n" +
"    \n" +
"        <script type=\"text/javascript\" src=\"themes/core.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"themes/ecmart/assets/js/theme.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/psproductcountdown/views/js/underscore.min.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/psproductcountdown/views/js/jquery.countdown.min.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/psproductcountdown/views/js/psproductcountdown.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/productcomments/js/jquery.rating.pack.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/productcomments/js/jquery.textareaCounter.plugin.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/productcomments/js/productcomments.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"js/jquery/ui/jquery-ui.min.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"js/jquery/plugins/fancybox/jquery.fancybox.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/ps_searchbar/ps_searchbar.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/ps_shoppingcart/ps_shoppingcart.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/stproductsearch/js/jquery.autocomplete_productsearch.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/stproductsearch/js/stsearch.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/pst_categoryslider/views/js/pst_categoryslider.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/psblog/views/js/lightbox-2.6.min.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"modules/pst_imageslider/views/js/jquery.flexslider-min.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"themes/ecmart/assets/js/owl.carousel.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"themes/ecmart/assets/js/totalstorage.js\" ></script>\n" +
"  <script type=\"text/javascript\" src=\"themes/ecmart/assets/js/custom.js\" ></script>\n" +
"\n" +
"\n" +
"    \n" +
"\n" +
"    \n" +
"    \n" +
"    \n" +
"  </body>\n" +
"\n" +
"</html>");




     }
      catch (Exception e)
      {}
      finally {}

    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
