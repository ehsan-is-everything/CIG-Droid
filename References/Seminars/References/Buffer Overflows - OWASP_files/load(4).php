var mediaWikiLoadStart=(new Date()).getTime();function isCompatible(ua){if(ua===undefined){ua=navigator.userAgent;}return!((ua.indexOf('MSIE')!==-1&&parseFloat(ua.split('MSIE')[1])<6)||(ua.indexOf('Firefox/')!==-1&&parseFloat(ua.split('Firefox/')[1])<3)||ua.match(/BlackBerry[^\/]*\/[1-5]\./)||ua.match(/webOS\/1\.[0-4]/)||ua.match(/PlayStation/i)||ua.match(/SymbianOS|Series60/)||ua.match(/NetFront/)||ua.match(/Opera Mini/)||ua.match(/S40OviBrowser/)||(ua.match(/Glass/)&&ua.match(/Android/)));}var startUp=function(){mw.config=new mw.Map(true);mw.loader.addSource({"local":{"loadScript":"/load.php","apiScript":"/api.php"}});mw.loader.register([["site","1472095051",[],"site"],["noscript","1472095052",[],"noscript"],["startup","1472148223",[],"startup"],["filepage","1472095052"],["user.groups","1472095052",[],"user"],["user","1472095052",[],"user"],["user.cssprefs","1471159113",["mediawiki.user"],"private"],["user.options","1471159113",[],"private"],["user.tokens","1471159113",[],"private"],
["mediawiki.language.data","1472095052",["mediawiki.language.init"]],["mediawiki.skinning.elements","1472095052"],["mediawiki.skinning.content","1472095052"],["mediawiki.skinning.interface","1472095051"],["skins.cologneblue","1472095052"],["skins.modern","1472095052"],["skins.vector.styles","1472095051"],["skins.monobook.styles","1472095052"],["skins.vector.js","1472095052",["jquery.throttle-debounce"]],["skins.vector.collapsibleNav","1472097180",["jquery.client","jquery.cookie","jquery.tabIndex"]],["jquery","1472095052"],["jquery.appear","1472095052"],["jquery.arrowSteps","1472095052"],["jquery.async","1472095052"],["jquery.autoEllipsis","1472095052",["jquery.highlightText"]],["jquery.badge","1472095052",["mediawiki.language"]],["jquery.byteLength","1472095052"],["jquery.byteLimit","1472095052",["jquery.byteLength"]],["jquery.checkboxShiftClick","1472095052"],["jquery.chosen","1472095052"],["jquery.client","1472095052"],["jquery.color","1472095052",["jquery.colorUtil"]],[
"jquery.colorUtil","1472095052"],["jquery.cookie","1472095052"],["jquery.delayedBind","1472095052"],["jquery.expandableField","1472095052"],["jquery.farbtastic","1472095052",["jquery.colorUtil"]],["jquery.footHovzer","1472095052"],["jquery.form","1472095052"],["jquery.fullscreen","1472095052"],["jquery.getAttrs","1472095052"],["jquery.hidpi","1472095052"],["jquery.highlightText","1472095052",["jquery.mwExtension"]],["jquery.hoverIntent","1472095052"],["jquery.json","1472095052"],["jquery.localize","1472095052"],["jquery.makeCollapsible","1472097180"],["jquery.mockjax","1472095052"],["jquery.mw-jump","1472095052"],["jquery.mwExtension","1472095052"],["jquery.placeholder","1472095052"],["jquery.qunit","1472095052"],["jquery.qunit.completenessTest","1472095052",["jquery.qunit"]],["jquery.spinner","1472095052"],["jquery.jStorage","1472095052",["jquery.json"]],["jquery.suggestions","1472095052",["jquery.highlightText"]],["jquery.tabIndex","1472095052"],["jquery.tablesorter","1472097199",[
"jquery.mwExtension","mediawiki.language.months"]],["jquery.textSelection","1472095052",["jquery.client"]],["jquery.throttle-debounce","1472095052"],["jquery.validate","1472095052"],["jquery.xmldom","1472095052"],["jquery.tipsy","1472095052"],["jquery.ui.core","1472095052",[],"jquery.ui"],["jquery.ui.widget","1472095052",[],"jquery.ui"],["jquery.ui.mouse","1472095052",["jquery.ui.widget"],"jquery.ui"],["jquery.ui.position","1472095052",[],"jquery.ui"],["jquery.ui.draggable","1472095052",["jquery.ui.core","jquery.ui.mouse","jquery.ui.widget"],"jquery.ui"],["jquery.ui.droppable","1472095052",["jquery.ui.core","jquery.ui.draggable","jquery.ui.mouse","jquery.ui.widget"],"jquery.ui"],["jquery.ui.resizable","1472095052",["jquery.ui.core","jquery.ui.mouse","jquery.ui.widget"],"jquery.ui"],["jquery.ui.selectable","1472095052",["jquery.ui.core","jquery.ui.mouse","jquery.ui.widget"],"jquery.ui"],["jquery.ui.sortable","1472095052",["jquery.ui.core","jquery.ui.mouse","jquery.ui.widget"],
"jquery.ui"],["jquery.ui.accordion","1472095052",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.ui.autocomplete","1472095052",["jquery.ui.core","jquery.ui.position","jquery.ui.widget"],"jquery.ui"],["jquery.ui.button","1472095052",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.ui.datepicker","1472095052",["jquery.ui.core"],"jquery.ui"],["jquery.ui.dialog","1472095052",["jquery.ui.button","jquery.ui.core","jquery.ui.draggable","jquery.ui.mouse","jquery.ui.position","jquery.ui.resizable","jquery.ui.widget"],"jquery.ui"],["jquery.ui.progressbar","1472095052",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.ui.slider","1472095052",["jquery.ui.core","jquery.ui.mouse","jquery.ui.widget"],"jquery.ui"],["jquery.ui.tabs","1472095052",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.effects.core","1472095052",[],"jquery.ui"],["jquery.effects.blind","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.bounce","1472095052",[
"jquery.effects.core"],"jquery.ui"],["jquery.effects.clip","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.drop","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.explode","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.fade","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.fold","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.highlight","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.pulsate","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.scale","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.shake","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.slide","1472095052",["jquery.effects.core"],"jquery.ui"],["jquery.effects.transfer","1472095052",["jquery.effects.core"],"jquery.ui"],["moment","1472095052"],["mediawiki","1472095052"],["mediawiki.api","1472095052",["mediawiki.util"]],["mediawiki.api.category","1472095052",[
"mediawiki.Title","mediawiki.api"]],["mediawiki.api.edit","1472095052",["mediawiki.Title","mediawiki.api","user.tokens"]],["mediawiki.api.login","1472095052",["mediawiki.api"]],["mediawiki.api.parse","1472095052",["mediawiki.api"]],["mediawiki.api.watch","1472095052",["mediawiki.api","user.tokens"]],["mediawiki.debug","1472095052",["jquery.footHovzer","jquery.tipsy"]],["mediawiki.debug.init","1472095052",["mediawiki.debug"]],["mediawiki.feedback","1472095052",["jquery.ui.dialog","mediawiki.Title","mediawiki.api.edit","mediawiki.jqueryMsg"]],["mediawiki.hidpi","1472095052",["jquery.hidpi"]],["mediawiki.hlist","1472095052",["jquery.client"]],["mediawiki.htmlform","1472127364"],["mediawiki.icon","1472095052"],["mediawiki.inspect","1472095052",["jquery.byteLength","jquery.json"]],["mediawiki.notification","1472095052",["mediawiki.page.startup"]],["mediawiki.notify","1472095052"],["mediawiki.searchSuggest","1472097180",["jquery.client","jquery.placeholder","jquery.suggestions",
"mediawiki.api"]],["mediawiki.Title","1472095052",["jquery.byteLength","mediawiki.util"]],["mediawiki.toc","1472097179",["jquery.cookie"]],["mediawiki.Uri","1472095052"],["mediawiki.user","1472095052",["jquery.cookie","mediawiki.api","user.options","user.tokens"]],["mediawiki.util","1472095052",["jquery.client","jquery.mwExtension","mediawiki.notify","mediawiki.toc"]],["mediawiki.action.edit","1472095052",["jquery.byteLimit","jquery.textSelection","mediawiki.action.edit.styles"]],["mediawiki.action.edit.styles","1472095052"],["mediawiki.action.edit.collapsibleFooter","1472095052",["jquery.cookie","jquery.makeCollapsible","mediawiki.icon"]],["mediawiki.action.edit.preview","1472095052",["jquery.form","jquery.spinner","mediawiki.action.history.diff"]],["mediawiki.action.history","1472095052",[],"mediawiki.action.history"],["mediawiki.action.history.diff","1472095052",[],"mediawiki.action.history"],["mediawiki.action.view.dblClickEdit","1472095052",["mediawiki.page.startup",
"mediawiki.util"]],["mediawiki.action.view.metadata","1472097571"],["mediawiki.action.view.postEdit","1472097180",["jquery.cookie","mediawiki.jqueryMsg"]],["mediawiki.action.view.redirectToFragment","1472095052",["jquery.client"]],["mediawiki.action.view.rightClickEdit","1472095052"],["mediawiki.action.edit.editWarning","1472101381",["mediawiki.jqueryMsg"]],["mediawiki.action.watch.ajax","1471159113",["mediawiki.page.watch.ajax"]],["mediawiki.language","1472095052",["mediawiki.cldr","mediawiki.language.data"]],["mediawiki.cldr","1472095052",["mediawiki.libs.pluralruleparser"]],["mediawiki.libs.pluralruleparser","1472095052"],["mediawiki.language.init","1472095052"],["mediawiki.jqueryMsg","1472095052",["mediawiki.language","mediawiki.util"]],["mediawiki.language.months","1472097199",["mediawiki.language"]],["mediawiki.libs.jpegmeta","1472095052"],["mediawiki.page.gallery","1472095052"],["mediawiki.page.ready","1472095052",["jquery.checkboxShiftClick","jquery.makeCollapsible",
"jquery.mw-jump","jquery.placeholder","mediawiki.util"]],["mediawiki.page.startup","1472095052",["mediawiki.util"]],["mediawiki.page.patrol.ajax","1472148223",["jquery.spinner","mediawiki.Title","mediawiki.api","mediawiki.notify","mediawiki.page.startup","mediawiki.util","user.tokens"]],["mediawiki.page.watch.ajax","1472101361",["jquery.mwExtension","mediawiki.api.watch","mediawiki.notify","mediawiki.page.startup","mediawiki.util"]],["mediawiki.page.image.pagination","1472095052",["jquery.spinner","mediawiki.Uri","mediawiki.util"]],["mediawiki.special","1472095052"],["mediawiki.special.block","1472095052",["mediawiki.util"]],["mediawiki.special.changeemail","1472095052",["mediawiki.util"]],["mediawiki.special.changeslist","1472095052"],["mediawiki.special.changeslist.legend","1472095052"],["mediawiki.special.changeslist.legend.js","1472095052",["jquery.cookie","jquery.makeCollapsible"]],["mediawiki.special.changeslist.enhanced","1472095052"],["mediawiki.special.movePage","1472095052",[
"jquery.byteLimit"]],["mediawiki.special.pagesWithProp","1472095052"],["mediawiki.special.preferences","1472095052",["mediawiki.language"]],["mediawiki.special.recentchanges","1472095052",["mediawiki.special"]],["mediawiki.special.search","1472097183"],["mediawiki.special.undelete","1472095052"],["mediawiki.special.upload","1472127364",["mediawiki.libs.jpegmeta","mediawiki.util"]],["mediawiki.special.userlogin.common.styles","1472095052"],["mediawiki.special.userlogin.signup.styles","1472095052"],["mediawiki.special.userlogin.login.styles","1472095052"],["mediawiki.special.userlogin.common.js","1472097908"],["mediawiki.special.userlogin.signup.js","1472095052",["jquery.throttle-debounce","mediawiki.api","mediawiki.jqueryMsg"]],["mediawiki.special.javaScriptTest","1472095052",["mediawiki.Uri"]],["mediawiki.special.version","1472095052"],["mediawiki.legacy.ajax","1472095052",["mediawiki.legacy.wikibits","mediawiki.util"]],["mediawiki.legacy.commonPrint","1472095051"],[
"mediawiki.legacy.config","1472095052",["mediawiki.legacy.wikibits"]],["mediawiki.legacy.protect","1472095052",["jquery.byteLimit"]],["mediawiki.legacy.shared","1472095051"],["mediawiki.legacy.oldshared","1472095052"],["mediawiki.legacy.upload","1472095052",["jquery.spinner","mediawiki.Title","mediawiki.api","mediawiki.util"]],["mediawiki.legacy.wikibits","1472095052",["mediawiki.util"]],["mediawiki.ui","1472095052"],["mediawiki.ui.button","1472095051"],["oojs","1472095052"],["oojs-ui","1472095052",["oojs"]],["ext.categoryTree","1472097188"],["ext.categoryTree.css","1472095052"],["ext.confirmAccount","1472095052"],["ext.languageSelector","1472095052"],["ext.headertabs","1472095052",["jquery.ui.tabs"]],["ext.nuke","1472095052"]]);mw.config.set({"wgLoadScript":"/load.php","debug":false,"skin":"vector","stylepath":"/skins","wgUrlProtocols":
"http\\:\\/\\/|https\\:\\/\\/|ftp\\:\\/\\/|ftps\\:\\/\\/|ssh\\:\\/\\/|sftp\\:\\/\\/|irc\\:\\/\\/|ircs\\:\\/\\/|xmpp\\:|sip\\:|sips\\:|gopher\\:\\/\\/|telnet\\:\\/\\/|nntp\\:\\/\\/|worldwind\\:\\/\\/|mailto\\:|tel\\:|sms\\:|news\\:|svn\\:\\/\\/|git\\:\\/\\/|mms\\:\\/\\/|bitcoin\\:|magnet\\:|urn\\:|geo\\:|\\/\\/","wgArticlePath":"/index.php/$1","wgScriptPath":"","wgScriptExtension":".php","wgScript":"/index.php","wgSearchType":null,"wgVariantArticlePath":false,"wgActionPaths":{},"wgServer":"//www.owasp.org","wgUserLanguage":"en","wgContentLanguage":"en","wgVersion":"1.23.15","wgEnableAPI":true,"wgEnableWriteAPI":true,"wgMainPageTitle":"Main Page","wgFormattedNamespaces":{"-2":"Media","-1":"Special","0":"","1":"Talk","2":"User","3":"User talk","4":"OWASP","5":"OWASP talk","6":"File","7":"File talk","8":"MediaWiki","9":"MediaWiki talk","10":"Template","11":"Template talk","12":"Help","13":"Help talk","14":"Category","15":"Category talk","274":"Widget","275":"Widget talk"},"wgNamespaceIds":
{"media":-2,"special":-1,"":0,"talk":1,"user":2,"user_talk":3,"owasp":4,"owasp_talk":5,"file":6,"file_talk":7,"mediawiki":8,"mediawiki_talk":9,"template":10,"template_talk":11,"help":12,"help_talk":13,"category":14,"category_talk":15,"widget":274,"widget_talk":275,"image":6,"image_talk":7,"project":4,"project_talk":5},"wgContentNamespaces":[0],"wgSiteName":"OWASP","wgFileExtensions":["vsd","odp","gif","png","jpg","jpeg","doc","ppt","mp3","pdf","psd","zip","tar","tar.gz","tar.bz2","jar","docx","pptx","xls","xlsx"],"wgDBname":"wiki","wgFileCanRotate":true,"wgAvailableSkins":{"vector":"Vector","cologneblue":"CologneBlue","modern":"Modern","monobook":"MonoBook"},"wgExtensionAssetsPath":"/extensions","wgCookiePrefix":"wiki","wgResourceLoaderMaxQueryLength":-1,"wgCaseSensitiveNamespaces":[],"wgLegalTitleChars":" %!\"$\u0026'()*,\\-./0-9:;=?@A-Z\\\\\\^_`a-z~+\\u0080-\\uFFFF","wgResourceLoaderStorageVersion":1,"wgResourceLoaderStorageEnabled":false,"htUseHistory":true,"htEditTabLink":true});};
if(isCompatible()){document.write("\u003Cscript src=\"/load.php?debug=false\u0026amp;lang=en\u0026amp;modules=jquery%2Cmediawiki\u0026amp;only=scripts\u0026amp;skin=vector\u0026amp;version=20160825T031732Z\"\u003E\u003C/script\u003E");};
/* cache key: wiki:resourceloader:filter:minify-js:7:82ccc65edc017195e4f7364dff84b89c */