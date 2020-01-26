// Template Start
$(document).ready(function() {

    bindGrid();

  
	
    // ---------------- home page blog slider setting ----------------------
    var psblog = $("#blog-carousel");
    psblog.owlCarousel({
        items: 3, //10 items above 1000px browser width
        itemsDesktop: [1199, 3],
        itemsDesktopSmall: [991, 2],
        itemsTablet: [767, 1],
        itemsMobile: [319, 1],
        pagination: false
    });
    // Custom Navigation Events
    $(".blog_next").click(function() {
        psblog.trigger('owl.next');
    })
    $(".blog_prev").click(function() {
        psblog.trigger('owl.prev');
    });


    // ---------------- start more menu setting ----------------------
    if (jQuery(window).width() >= 1300) {
        var max_elem = 4;
        var items = $('.menu ul#top-menu > li');
        var surplus = items.slice(max_elem, items.length);

        surplus.wrapAll('<li class="category more_menu" id="more_menu"><div id="top_moremenu" class="popover sub-menu js-sub-menu collapse"><ul class="top-menu more_sub_menu">');

        $('.menu ul#top-menu .more_menu').prepend('<a href="#" class="dropdown-item" data-depth="0"><span class="float-xs-right hidden-md-up"><span data-target="#top_moremenu" data-toggle="collapse" class="navbar-toggler collapse-icons"><i class="material-icons add">&#xE313;</i><i class="material-icons remove">&#xE316;</i></span></span></span>More</a>');

        $('.menu ul#top-menu .more_menu').mouseover(function() {
                $(this).children('div').css('display', 'block');
            })
            .mouseout(function() {
                $(this).children('div').css('display', 'none');
            });
    } 
	else if ((jQuery(window).width() >= 1200) && (jQuery(window).width() <= 1299)) {
        var max_elem = 3;
        var items = $('.menu ul#top-menu > li');
        var surplus = items.slice(max_elem, items.length);

        surplus.wrapAll('<li class="category more_menu" id="more_menu"><div id="top_moremenu" class="popover sub-menu js-sub-menu collapse"><ul class="top-menu more_sub_menu">');

        $('.menu ul#top-menu .more_menu').prepend('<a href="#" class="dropdown-item" data-depth="0"><span class="float-xs-right hidden-md-up"><span data-target="#top_moremenu" data-toggle="collapse" class="navbar-toggler collapse-icons"><i class="material-icons add">&#xE313;</i><i class="material-icons remove">&#xE316;</i></span></span></span>More</a>');

        $('.menu ul#top-menu .more_menu').mouseover(function() {
                $(this).children('div').css('display', 'block');
            })
            .mouseout(function() {
                $(this).children('div').css('display', 'none');
            });
    }
	else if ((jQuery(window).width() >= 992) && (jQuery(window).width() <= 1199)) {
        var max_elem = 2;
        var items = $('.menu ul#top-menu > li');
        var surplus = items.slice(max_elem, items.length);

        surplus.wrapAll('<li class="category more_menu" id="more_menu"><div id="top_moremenu" class="popover sub-menu js-sub-menu collapse"><ul class="top-menu more_sub_menu">');

        $('.menu ul#top-menu .more_menu').prepend('<a href="#" class="dropdown-item" data-depth="0"><span class="float-xs-right hidden-md-up"><span data-target="#top_moremenu" data-toggle="collapse" class="navbar-toggler collapse-icons"><i class="material-icons add">&#xE313;</i><i class="material-icons remove">&#xE316;</i></span></span></span>More</a>');

        $('.menu ul#top-menu .more_menu').mouseover(function() {
                $(this).children('div').css('display', 'block');
            })
            .mouseout(function() {
                $(this).children('div').css('display', 'none');
            });
    }
    // ---------------- end more menu setting ----------------------



    /* ---------------- start more menu setting ---------------------- */
    if (jQuery(window).width() >= 1300) {
        var max_elem = 10;
        var items = $('.vertical-menu ul#top-vertical-menu[data-depth="0"] > li');
        var surplus = items.slice(max_elem, items.length);

        surplus.wrapAll('<li class="category more_menu" id="more_menu"><div id="top_moremenu" class="popover sub-menu js-sub-menu collapse"><ul class="top-menu more_sub_menu">');

        $('.vertical-menu ul#top-vertical-menu .more_menu').prepend('<a href="#" class="dropdown-item" data-depth="0"><span class="float-xs-right hidden-md-up"><span data-target="#top_moremenu" data-toggle="collapse" class="navbar-toggler collapse-icons"><i class="material-icons add">&#xE313;</i><i class="material-icons remove">&#xE316;</i></span></span></span>More Menu</a>');

        $('.vertical-menu ul#top-vertical-menu .more_menu').mouseover(function() {
                $(this).children('div').css('display', 'block');
            })
            .mouseout(function() {
                $(this).children('div').css('display', 'none');
            });
    } else if ((jQuery(window).width() >= 992) && (jQuery(window).width() <= 1299)) {
        var max_elem = 8;
        var items = $('.vertical-menu ul#top-vertical-menu[data-depth="0"] > li');
        var surplus = items.slice(max_elem, items.length);

        surplus.wrapAll('<li class="category more_menu" id="more_menu"><div id="top_moremenu" class="popover sub-menu js-sub-menu collapse"><ul class="top-menu more_sub_menu">');

        $('.vertical-menu ul#top-vertical-menu .more_menu').prepend('<a href="#" class="dropdown-item" data-depth="0"><span class="float-xs-right hidden-md-up"><span data-target="#top_moremenu" data-toggle="collapse" class="navbar-toggler collapse-icons"><i class="material-icons add">&#xE313;</i><i class="material-icons remove">&#xE316;</i></span></span></span>More Menu</a>');

        $('.vertical-menu ul#top-vertical-menu .more_menu').mouseover(function() {
                $(this).children('div').css('display', 'block');
            })
            .mouseout(function() {
                $(this).children('div').css('display', 'none');
            });
    }
    /* ---------------- end more menu setting ----------------------	*/

	 /* ---------------- header search append  ----------------------	*/
	 if ($(document).width() <= 991) {
        $('.nav-bar .container #_desktop_st_search_block_top').appendTo('.header-top .container');

     } 
	 

});

$(".products-section-title").wrap("<div class='title-wrapper'></div>");
$(".all-product-link").wrap("<div class='product-more'></div>");


$('#header .search_button').click(function(event) {
    $(this).toggleClass('active');
    event.stopPropagation();
    $("#header .searchtoggle").slideToggle("fast");
    $(".ui-autocomplete-input").focus();
});


 if (jQuery(window).width() >= 992) {
$('.nav-bar .vertical-menu .top-vertical-menu').css('display', 'none');
$('.nav-bar .vertical-menu .block-title').click(function(event) {
    $('.nav-bar .vertical-menu .top-vertical-menu').toggleClass('active');
    event.stopPropagation();
    $('.nav-bar .vertical-menu .top-vertical-menu').slideToggle("medium");
});
 }
 
 
$(".searchtoggle").on("click", function(event) {
    event.stopPropagation();
});

$('.pst_userinfotitle').click(function(event) {
    $(this).toggleClass('active');
    event.stopPropagation();
    $(".user-info").slideToggle("fast");
});
$(".user-info").on("click", function(event) {
    event.stopPropagation();
});

// Add/Remove acttive class on menu active in responsive  
$('#menu-icon').on('click', function() {
    $(this).toggleClass('active');
});

// Loading image before flex slider load
$(window).load(function() {
    $(".loadingdiv").removeClass("spinner");
});

// Flex slider load
$(window).load(function() {
    if ($('.flexslider').length > 0) {
        $('.flexslider').flexslider({
            slideshowSpeed: $('.flexslider').data('interval'),
            pauseOnHover: $('.flexslider').data('pause'),
            animation: "fade"
        });
    }
});

// Scroll page bottom to top
$(window).scroll(function() {
    if ($(this).scrollTop() > 500) {
        $('.top_button').fadeIn(500);
    } else {
        $('.top_button').fadeOut(500);
    }
});
$('.top_button').click(function(event) {
    event.preventDefault();
    $('html, body').animate({
        scrollTop: 0
    }, 800);
});


/*======  Carousel Slider For Feature Product ==== */

var pstfeature = $("#pstfeature-carousel");
pstfeature.owlCarousel({
    items: 5, //10 items above 1000px browser width		
    itemsDesktop: [1299, 4],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 2],
    itemsMobile: [479, 1],
    pagination: false,
    autoplay: true
});
// Custom Navigation Events
$(".pstfeature_next").click(function() {
    pstfeature.trigger('owl.next');
})
$(".pstfeature_prev").click(function() {
    pstfeature.trigger('owl.prev');
});


/*======  Carousel Slider For New Product ==== */

var pstnewproduct = $("#pstnewproduct-carousel");
pstnewproduct.owlCarousel({
    items: 5, //10 items above 1000px browser width
    itemsDesktop: [1299, 4],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 2],
    itemsMobile: [479, 1],
    pagination: false
});
// Custom Navigation Events
$(".pstnewproduct_next").click(function() {
    pstnewproduct.trigger('owl.next');
})
$(".pstnewproduct_prev").click(function() {
    pstnewproduct.trigger('owl.prev');
});



/*======  Carousel Slider For Bestseller Product ==== */

var pstbestseller = $("#pstbestseller-carousel");
pstbestseller.owlCarousel({
    items: 5, //10 items above 1000px browser width
    itemsDesktop: [1299, 4],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 2],
    itemsMobile: [479, 1],
    pagination: false
});
// Custom Navigation Events
$(".pstbestseller_next").click(function() {
    pstbestseller.trigger('owl.next');
})
$(".pstbestseller_prev").click(function() {
    pstbestseller.trigger('owl.prev');
});

/*======  Carousel Slider For Special Product ==== */
var pstspecial = $("#pstspecial-carousel");
pstspecial.owlCarousel({
    items: 1, //10 items above 1000px browser width
    itemsDesktop: [1299, 1],
    itemsDesktopSmall: [991, 1],
    itemsTablet: [767, 1],
    itemsMobile: [479, 1],
	transitionStyle: "fade",
    pagination: false
	
});
// Custom Navigation Events
$(".pstspecial_next").click(function() {
    pstspecial.trigger('owl.next');
})
$(".pstspecial_prev").click(function() {
    pstspecial.trigger('owl.prev');
});


/*======  Carousel Slider For Accessories Product ==== */

var pstaccessories = $("#pstaccessories-carousel");
pstaccessories.owlCarousel({
    items: 5, //10 items above 1000px browser width
    itemsDesktop: [1299, 4],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 2],
    itemsMobile: [479, 1],
    pagination: false
});
// Custom Navigation Events
$(".pstaccessories_next").click(function() {
    pstaccessories.trigger('owl.next');
})
$(".pstaccessories_prev").click(function() {
    pstaccessories.trigger('owl.prev');
});


/*======  Carousel Slider For Category Product ==== */

var pstproductscategory = $("#pstproductscategory-carousel");
pstproductscategory.owlCarousel({
   	items: 5, //10 items above 1000px browser width
     itemsDesktop: [1299, 4],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 2],
    itemsMobile: [479, 1],
    pagination: false
});
// Custom Navigation Events
$(".pstproductscategory_next").click(function() {
    pstproductscategory.trigger('owl.next');
})
$(".pstproductscategory_prev").click(function() {
    pstproductscategory.trigger('owl.prev');
});


/*======  Carousel Slider For Viewed Product ==== */

var pstviewed = $("#pstviewed-carousel");
pstviewed.owlCarousel({
    items: 5, //10 items above 1000px browser width
     itemsDesktop: [1299, 4],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 2],
    itemsMobile: [479, 1],
    pagination: false
});
// Custom Navigation Events
$(".pstviewed_next").click(function() {
    pstviewed.trigger('owl.next');
})
$(".pstviewed_prev").click(function() {
    pstviewed.trigger('owl.prev');
});

/*======  Carousel Slider For Crosssell Product ==== */

var pstcrosssell = $("#pstcrosssell-carousel");
pstcrosssell.owlCarousel({
    items: 5, //10 items above 1000px browser width
    itemsDesktop: [1299, 4],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 2],
    itemsMobile: [479, 1],
    pagination: false
});
// Custom Navigation Events
$(".pstcrosssell_next").click(function() {
    pstcrosssell.trigger('owl.next');
})
$(".pstcrosssell_prev").click(function() {
    pstcrosssell.trigger('owl.prev');
});

/*======  Carousel Slider For Manufacture ==== */
var pstbrand = $("#pstbrand-carousel");
pstbrand.owlCarousel({
    items: 5, //10 items above 1000px browser width
    itemsDesktop: [1299, 5],
    itemsDesktopSmall: [991, 3],
    itemsTablet: [767, 1],
    itemsMobile: [479, 1],
    pagination: false
});
// Custom Navigation Events
$(".pstbrand_next").click(function() {
    pstbrand.trigger('owl.next');
})
$(".pstbrand_prev").click(function() {
    pstbrand.trigger('owl.prev');
});

var psttestimonialcmsblock = $("#psttestimonial-carousel");
psttestimonialcmsblock.owlCarousel({
	pagination: false,
	navigation: true,
	autoPlay: false,
	singleItem: true
});


function bindGrid() {
    var view = $.totalStorage("display");

    if (view && view != 'grid')
        display(view);
    else
        $('.display').find('li#grid').addClass('selected');

    $(document).on('click', '#grid', function(e) {
        e.preventDefault();
        display('grid');
    });

    $(document).on('click', '#list', function(e) {
        e.preventDefault();
        display('list');
    });
}

function display(view) {
    if (view == 'list') {
        $('#products ul.product_list').removeClass('grid').addClass('list');
        $('#products .product_list > li').removeClass('col-xs-12 col-sm-6 col-md-6 col-lg-4').addClass('col-xs-12');


        $('#products .product_list > li').each(function(index, element) {
            var html = '';
            html = '<div class="product-miniature js-product-miniature" data-id-product="' + $(element).find('.product-miniature').data('id-product') + '" data-id-product-attribute="' + $(element).find('.product-miniature').data('id-product-attribute') + '" itemscope itemtype="../../../../../schema.org/Product"><div class="row">';
            html += '<div class="thumbnail-container col-xs-4 col-xs-5 col-md-4">' + $(element).find('.thumbnail-container').html() + '</div>';

            html += '<div class="product-description center-block col-xs-4 col-xs-7 col-md-8">';
            html += '<h3 class="h3 product-title" itemprop="name">' + $(element).find('h3').html() + '</h3>';

            var price = $(element).find('.product-price-and-shipping').html(); // check : catalog mode is enabled
            if (price != null) {
                html += '<div class="product-price-and-shipping">' + price + '</div>';
            }
			var discountprice = $(element).find('.discount-percentage').html(); // check : catalog mode is enabled
			if (discountprice != null) {
			html += '<span class="discount-percentage">' + discountprice + '</span>';
			}
			
			
            html += '<div class="product-detail">' + $(element).find('.product-detail').html() + '</div>';
			html += '<div class="comments_note">' + $(element).find('.comments_note').html() + '</div>';
            var colorList = $(element).find('.highlighted-informations').html();
            if (colorList != null) {
                html += '<div class="highlighted-informations">' + colorList + '</div>';
            }

            html += '</div>';			
            html += '</div></div>';
            $(element).html(html);
        });
        $('.display').find('li#list').addClass('selected');
        $('.display').find('li#grid').removeAttr('class');
        $.totalStorage('display', 'list');
    } else {
        $('#products ul.product_list').removeClass('list').addClass('grid');
        $('#products .product_list > li').removeClass('col-xs-12').addClass('col-xs-12 col-sm-6 col-md-6 col-lg-4');
        $('#products .product_list > li').each(function(index, element) {
            var html = '';
            html += '<div class="product-miniature js-product-miniature" data-id-product="' + $(element).find('.product-miniature').data('id-product') + '" data-id-product-attribute="' + $(element).find('.product-miniature').data('id-product-attribute') + '" itemscope itemtype="../../../../../schema.org/Product">';	
            html += '<div class="thumbnail-container">' + $(element).find('.thumbnail-container').html() + '</div>';
			
						 
            html += '<div class="product-description">';
            html += '<h3 class="h3 product-title" itemprop="name">' + $(element).find('h3').html() + '</h3>';
			
			var discountprice = $(element).find('.discount-percentage').html(); // check : catalog mode is enabled
			if (discountprice != null) {
			html += '<span class="discount-percentage">' + discountprice + '</span>';
			}
			
            var price = $(element).find('.product-price-and-shipping').html(); // check : catalog mode is enabled
            if (price != null) {
                html += '<div class="product-price-and-shipping">' + price + '</div>';
            }
			html += '<div class="comments_note">' + $(element).find('.comments_note').html() + '</div>';

            html += '<div class="product-detail">' + $(element).find('.product-detail').html() + '</div>';
			          
            html += '</div>';
			html += '<div class="product-actions">' + $(element).find('.product-actions').html() + '</div>';
			
            html += '</div>';
            $(element).html(html);
        });
        $('.display').find('li#grid').addClass('selected');
        $('.display').find('li#list').removeAttr('class');
        $.totalStorage('display', 'grid');
    }
}


function responsivecolumn() {

    if ($(document).width() <= 991) {

        // ---------------- Fixed header responsive ----------------------
        $(window).bind('scroll', function() {
            if ($(window).scrollTop() > 0) {
                $('.header-nav').addClass('fixed');
            } else {
                $('.header-nav').removeClass('fixed');
            }
        });
    }


    if ($(document).width() <= 991) {
        $('.container #columns_inner #left-column').appendTo('.container #columns_inner');

    } else if ($(document).width() >= 992) {
        $('.container #columns_inner #left-column').prependTo('.container #columns_inner');

    }
}
$(document).ready(function() {
    responsivecolumn();
});
$(window).resize(function() {
    responsivecolumn();
});
 // JS for fixed the header
function HeadFixTop() {
    var num = 141;
    if ($(document).width() >= 992) {
        $(window).bind('scroll', function() {
            if ($(window).scrollTop() > num) {
                $('.header-top').addClass('fixed');
            } else {
                $('.header-top').removeClass('fixed');
            }
        });
    } else {
        $('.header-top').removeClass('fixed');
    }
} 
jQuery(document).ready(function() {
    "use strict";
    HeadFixTop();
    $("#top-menu .sub-menu li:has(ul)").parent().parent().parent().addClass("mega");
    $("#top-vertical-menu li:has(ul)").parent().parent().addClass("mega");
});
jQuery(window).resize(function() {
    "use strict";
    HeadFixTop()
});

/* Banner-CMS-Block*/

	function cmsbannerblock() {
	if ($(document).width() <= 991) {
		$('#pst_cmsbannerblock .pst-cmsblock-wrapper').css('display', 'none');
		$('#pst_cmsbannerblock .cmsblock-heading').click(function(event) {
		$('#pst_cmsbannerblock .pst-cmsblock-wrapper').toggleClass('active');
		event.stopPropagation();
		$('#pst_cmsbannerblock .pst-cmsblock-wrapper').slideToggle("medium");
	});
	}	
	}

	$(document).ready(function() {
		cmsbannerblock()	
	});


	
/*  Add To Cart - JS */

var _0x7035=["\x61\x74\x63\x5F\x73\x70\x69\x6E\x6E\x65\x72","\x61\x64\x64\x43\x6C\x61\x73\x73","\x61\x75\x74\x6F\x72\x65\x6E\x65\x77","\x68\x74\x6D\x6C","\x69","\x66\x69\x6E\x64","\x64\x61\x74\x61\x2D\x69\x64\x2D\x70\x72\x6F\x64\x75\x63\x74\x2D\x61\x74\x74\x72\x69\x62\x75\x74\x65","\x61\x74\x74\x72","\x70\x61\x72\x65\x6E\x74","\x76\x61\x6C","\x2E\x61\x74\x63\x5F\x71\x74\x79","\x64\x61\x74\x61\x2D\x69\x64\x2D\x70\x72\x6F\x64\x75\x63\x74","\x50\x4F\x53\x54","\x6E\x6F\x2D\x63\x61\x63\x68\x65","\x63\x61\x72\x74","\x70\x61\x67\x65\x73","\x75\x72\x6C\x73","\x3F\x72\x61\x6E\x64\x3D","\x67\x65\x74\x54\x69\x6D\x65","\x6A\x73\x6F\x6E","\x61\x63\x74\x69\x6F\x6E\x3D\x75\x70\x64\x61\x74\x65\x26\x61\x64\x64\x3D\x31\x26\x61\x6A\x61\x78\x3D\x74\x72\x75\x65\x26\x71\x74\x79\x3D","\x31","\x26\x69\x64\x5F\x70\x72\x6F\x64\x75\x63\x74\x3D","\x26\x74\x6F\x6B\x65\x6E\x3D","\x73\x74\x61\x74\x69\x63\x5F\x74\x6F\x6B\x65\x6E","\x26\x69\x70\x61\x3D","","\x26\x69\x64\x5F\x63\x75\x73\x74\x6F\x6D\x69\x7A\x61\x74\x69\x6F\x6E\x3D","\x75\x6E\x64\x65\x66\x69\x6E\x65\x64","\x72\x65\x6D\x6F\x76\x65\x43\x6C\x61\x73\x73","\x61\x64\x64\x5F\x73\x68\x6F\x70\x70\x69\x6E\x67\x5F\x63\x61\x72\x74","\x75\x70\x64\x61\x74\x65\x43\x61\x72\x74","\x61\x64\x64\x2D\x74\x6F\x2D\x63\x61\x72\x74","\x65\x6D\x69\x74","\x61\x6A\x61\x78"];var mypresta_productListCart={add:function(_0x4bd3x2){_0x4bd3x2[_0x7035[5]](_0x7035[4])[_0x7035[3]](_0x7035[2])[_0x7035[1]](_0x7035[0]);idCombination= _0x4bd3x2[_0x7035[8]]()[_0x7035[8]]()[_0x7035[8]]()[_0x7035[8]]()[_0x7035[8]]()[_0x7035[7]](_0x7035[6]);quantity= _0x4bd3x2[_0x7035[8]]()[_0x7035[5]](_0x7035[10])[_0x7035[9]]();idProduct= _0x4bd3x2[_0x7035[8]]()[_0x7035[8]]()[_0x7035[8]]()[_0x7035[8]]()[_0x7035[8]]()[_0x7035[7]](_0x7035[11]);$[_0x7035[34]]({type:_0x7035[12],headers:{"\x63\x61\x63\x68\x65\x2D\x63\x6F\x6E\x74\x72\x6F\x6C":_0x7035[13]},url:prestashop[_0x7035[16]][_0x7035[15]][_0x7035[14]]+ _0x7035[17]+  new Date()[_0x7035[18]](),async:true,cache:false,dataType:_0x7035[19],data:_0x7035[20]+ ((quantity&& quantity!= null)?quantity:_0x7035[21])+ _0x7035[22]+ idProduct+ _0x7035[23]+ prestashop[_0x7035[24]]+ ((parseInt(idCombination)&& idCombination!= null)?_0x7035[25]+ parseInt(idCombination):_0x7035[26]+ _0x7035[27]+ (( typeof customizationId!== _0x7035[28])?customizationId:0)),success:function(_0x4bd3x3,_0x4bd3x4,_0x4bd3x5){_0x4bd3x2[_0x7035[5]](_0x7035[4])[_0x7035[3]](_0x7035[30])[_0x7035[29]](_0x7035[0]);prestashop[_0x7035[33]](_0x7035[31],{reason:{idProduct:idProduct,idProductAttribute:idCombination,linkAction:_0x7035[32]}})}})}}


	
	