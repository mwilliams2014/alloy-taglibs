package com.liferay.alloy.taglib.alloy.base;

import com.liferay.alloy.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * <a href="BaseImageViewerTag.java.html"><b><i>View Source</i></b></a>
 *
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public class BaseImageViewerTag extends IncludeTag {

	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	protected String _getPage() {
		return _PAGE;
	}

	public java.lang.Boolean getAnim() {
		return _anim;
	}

	public java.lang.String getArrowLeftEl() {
		return _arrowLeftEl;
	}

	public java.lang.String getArrowRightEl() {
		return _arrowRightEl;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.String getCaption() {
		return _caption;
	}

	public java.lang.String getCaptionEl() {
		return _captionEl;
	}

	public java.lang.Boolean getCaptionFromTitle() {
		return _captionFromTitle;
	}

	public java.lang.Boolean getCentered() {
		return _centered;
	}

	public java.lang.String getCloseEl() {
		return _closeEl;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public java.lang.Number getCurrentIndex() {
		return _currentIndex;
	}

	public java.lang.Boolean getDestroyed() {
		return _destroyed;
	}

	public java.lang.Boolean getDisabled() {
		return _disabled;
	}

	public java.lang.Boolean getFocused() {
		return _focused;
	}

	public java.lang.String getHeight() {
		return _height;
	}

	public java.lang.String getHideClass() {
		return _hideClass;
	}

	public java.lang.String getImageviewerId() {
		return _imageviewerId;
	}

	public java.lang.String getImage() {
		return _image;
	}

	public java.lang.Object getImageAnim() {
		return _imageAnim;
	}

	public java.lang.String getInfoEl() {
		return _infoEl;
	}

	public java.lang.String getInfoTemplate() {
		return _infoTemplate;
	}

	public java.lang.Boolean getInitialized() {
		return _initialized;
	}

	public java.lang.String getLinks() {
		return _links;
	}

	public java.lang.String getLoader() {
		return _loader;
	}

	public java.lang.Boolean getLoading() {
		return _loading;
	}

	public java.lang.String getLoadingEl() {
		return _loadingEl;
	}

	public java.lang.Number getMaxHeight() {
		return _maxHeight;
	}

	public java.lang.Number getMaxWidth() {
		return _maxWidth;
	}

	public java.lang.String getModal() {
		return _modal;
	}

	public java.lang.Boolean getPreloadAllImages() {
		return _preloadAllImages;
	}

	public java.lang.Boolean getRender() {
		return _render;
	}

	public java.lang.Boolean getRendered() {
		return _rendered;
	}

	public java.lang.Boolean getShowArrows() {
		return _showArrows;
	}

	public java.lang.Boolean getShowClose() {
		return _showClose;
	}

	public java.lang.String getSrcNode() {
		return _srcNode;
	}

	public java.lang.Object getStrings() {
		return _strings;
	}

	public java.lang.Number getTabIndex() {
		return _tabIndex;
	}

	public java.lang.Boolean getTotalLinks() {
		return _totalLinks;
	}

	public java.lang.Boolean getVisible() {
		return _visible;
	}

	public java.lang.String getWidth() {
		return _width;
	}

	public java.lang.String getAfterAnim() {
		return _afterAnim;
	}

	public java.lang.String getAfterAnimChange() {
		return _afterAnimChange;
	}

	public java.lang.String getAfterArrowLeftElChange() {
		return _afterArrowLeftElChange;
	}

	public java.lang.String getAfterArrowRightElChange() {
		return _afterArrowRightElChange;
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.String getAfterCaptionChange() {
		return _afterCaptionChange;
	}

	public java.lang.String getAfterCaptionElChange() {
		return _afterCaptionElChange;
	}

	public java.lang.String getAfterCaptionFromTitleChange() {
		return _afterCaptionFromTitleChange;
	}

	public java.lang.String getAfterCenteredChange() {
		return _afterCenteredChange;
	}

	public java.lang.String getAfterCloseElChange() {
		return _afterCloseElChange;
	}

	public java.lang.String getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.String getAfterCssClassChange() {
		return _afterCssClassChange;
	}

	public java.lang.String getAfterCurrentIndexChange() {
		return _afterCurrentIndexChange;
	}

	public java.lang.String getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.String getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.String getAfterDisabledChange() {
		return _afterDisabledChange;
	}

	public java.lang.String getAfterFocusedChange() {
		return _afterFocusedChange;
	}

	public java.lang.String getAfterHeightChange() {
		return _afterHeightChange;
	}

	public java.lang.String getAfterHideClassChange() {
		return _afterHideClassChange;
	}

	public java.lang.String getAfterIdChange() {
		return _afterIdChange;
	}

	public java.lang.String getAfterImageAnimChange() {
		return _afterImageAnimChange;
	}

	public java.lang.String getAfterImageChange() {
		return _afterImageChange;
	}

	public java.lang.String getAfterInfoElChange() {
		return _afterInfoElChange;
	}

	public java.lang.String getAfterInfoTemplateChange() {
		return _afterInfoTemplateChange;
	}

	public java.lang.String getAfterInit() {
		return _afterInit;
	}

	public java.lang.String getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.String getAfterLinksChange() {
		return _afterLinksChange;
	}

	public java.lang.String getAfterLoad() {
		return _afterLoad;
	}

	public java.lang.String getAfterLoaderChange() {
		return _afterLoaderChange;
	}

	public java.lang.String getAfterLoadingChange() {
		return _afterLoadingChange;
	}

	public java.lang.String getAfterLoadingElChange() {
		return _afterLoadingElChange;
	}

	public java.lang.String getAfterMaxHeightChange() {
		return _afterMaxHeightChange;
	}

	public java.lang.String getAfterMaxWidthChange() {
		return _afterMaxWidthChange;
	}

	public java.lang.String getAfterModalChange() {
		return _afterModalChange;
	}

	public java.lang.String getAfterPreloadAllImagesChange() {
		return _afterPreloadAllImagesChange;
	}

	public java.lang.String getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.String getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.String getAfterRequest() {
		return _afterRequest;
	}

	public java.lang.String getAfterShowArrowsChange() {
		return _afterShowArrowsChange;
	}

	public java.lang.String getAfterShowCloseChange() {
		return _afterShowCloseChange;
	}

	public java.lang.String getAfterSrcNodeChange() {
		return _afterSrcNodeChange;
	}

	public java.lang.String getAfterStringsChange() {
		return _afterStringsChange;
	}

	public java.lang.String getAfterTabIndexChange() {
		return _afterTabIndexChange;
	}

	public java.lang.String getAfterTotalLinksChange() {
		return _afterTotalLinksChange;
	}

	public java.lang.String getAfterVisibleChange() {
		return _afterVisibleChange;
	}

	public java.lang.String getAfterContentUpdate() {
		return _afterContentUpdate;
	}

	public java.lang.String getAfterRender() {
		return _afterRender;
	}

	public java.lang.String getAfterWidthChange() {
		return _afterWidthChange;
	}

	public java.lang.String getOnAnim() {
		return _onAnim;
	}

	public java.lang.String getOnAnimChange() {
		return _onAnimChange;
	}

	public java.lang.String getOnArrowLeftElChange() {
		return _onArrowLeftElChange;
	}

	public java.lang.String getOnArrowRightElChange() {
		return _onArrowRightElChange;
	}

	public java.lang.String getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.String getOnCaptionChange() {
		return _onCaptionChange;
	}

	public java.lang.String getOnCaptionElChange() {
		return _onCaptionElChange;
	}

	public java.lang.String getOnCaptionFromTitleChange() {
		return _onCaptionFromTitleChange;
	}

	public java.lang.String getOnCenteredChange() {
		return _onCenteredChange;
	}

	public java.lang.String getOnCloseElChange() {
		return _onCloseElChange;
	}

	public java.lang.String getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.String getOnCssClassChange() {
		return _onCssClassChange;
	}

	public java.lang.String getOnCurrentIndexChange() {
		return _onCurrentIndexChange;
	}

	public java.lang.String getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.String getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.String getOnDisabledChange() {
		return _onDisabledChange;
	}

	public java.lang.String getOnFocusedChange() {
		return _onFocusedChange;
	}

	public java.lang.String getOnHeightChange() {
		return _onHeightChange;
	}

	public java.lang.String getOnHideClassChange() {
		return _onHideClassChange;
	}

	public java.lang.String getOnIdChange() {
		return _onIdChange;
	}

	public java.lang.String getOnImageAnimChange() {
		return _onImageAnimChange;
	}

	public java.lang.String getOnImageChange() {
		return _onImageChange;
	}

	public java.lang.String getOnInfoElChange() {
		return _onInfoElChange;
	}

	public java.lang.String getOnInfoTemplateChange() {
		return _onInfoTemplateChange;
	}

	public java.lang.String getOnInit() {
		return _onInit;
	}

	public java.lang.String getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.String getOnLinksChange() {
		return _onLinksChange;
	}

	public java.lang.String getOnLoad() {
		return _onLoad;
	}

	public java.lang.String getOnLoaderChange() {
		return _onLoaderChange;
	}

	public java.lang.String getOnLoadingChange() {
		return _onLoadingChange;
	}

	public java.lang.String getOnLoadingElChange() {
		return _onLoadingElChange;
	}

	public java.lang.String getOnMaxHeightChange() {
		return _onMaxHeightChange;
	}

	public java.lang.String getOnMaxWidthChange() {
		return _onMaxWidthChange;
	}

	public java.lang.String getOnModalChange() {
		return _onModalChange;
	}

	public java.lang.String getOnPreloadAllImagesChange() {
		return _onPreloadAllImagesChange;
	}

	public java.lang.String getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.String getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.String getOnRequest() {
		return _onRequest;
	}

	public java.lang.String getOnShowArrowsChange() {
		return _onShowArrowsChange;
	}

	public java.lang.String getOnShowCloseChange() {
		return _onShowCloseChange;
	}

	public java.lang.String getOnSrcNodeChange() {
		return _onSrcNodeChange;
	}

	public java.lang.String getOnStringsChange() {
		return _onStringsChange;
	}

	public java.lang.String getOnTabIndexChange() {
		return _onTabIndexChange;
	}

	public java.lang.String getOnTotalLinksChange() {
		return _onTotalLinksChange;
	}

	public java.lang.String getOnVisibleChange() {
		return _onVisibleChange;
	}

	public java.lang.String getOnContentUpdate() {
		return _onContentUpdate;
	}

	public java.lang.String getOnRender() {
		return _onRender;
	}

	public java.lang.String getOnWidthChange() {
		return _onWidthChange;
	}

	public void setAnim(java.lang.Boolean anim) {
		_anim = anim;

		setScopedAttribute("anim", anim);
	}

	public void setArrowLeftEl(java.lang.String arrowLeftEl) {
		_arrowLeftEl = arrowLeftEl;

		setScopedAttribute("arrowLeftEl", arrowLeftEl);
	}

	public void setArrowRightEl(java.lang.String arrowRightEl) {
		_arrowRightEl = arrowRightEl;

		setScopedAttribute("arrowRightEl", arrowRightEl);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setCaption(java.lang.String caption) {
		_caption = caption;

		setScopedAttribute("caption", caption);
	}

	public void setCaptionEl(java.lang.String captionEl) {
		_captionEl = captionEl;

		setScopedAttribute("captionEl", captionEl);
	}

	public void setCaptionFromTitle(java.lang.Boolean captionFromTitle) {
		_captionFromTitle = captionFromTitle;

		setScopedAttribute("captionFromTitle", captionFromTitle);
	}

	public void setCentered(java.lang.Boolean centered) {
		_centered = centered;

		setScopedAttribute("centered", centered);
	}

	public void setCloseEl(java.lang.String closeEl) {
		_closeEl = closeEl;

		setScopedAttribute("closeEl", closeEl);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
	}

	public void setCurrentIndex(java.lang.Number currentIndex) {
		_currentIndex = currentIndex;

		setScopedAttribute("currentIndex", currentIndex);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setFocused(java.lang.Boolean focused) {
		_focused = focused;

		setScopedAttribute("focused", focused);
	}

	public void setHeight(java.lang.String height) {
		_height = height;

		setScopedAttribute("height", height);
	}

	public void setHideClass(java.lang.String hideClass) {
		_hideClass = hideClass;

		setScopedAttribute("hideClass", hideClass);
	}

	public void setImageviewerId(java.lang.String imageviewerId) {
		_imageviewerId = imageviewerId;

		setScopedAttribute("imageviewerId", imageviewerId);
	}

	public void setImage(java.lang.String image) {
		_image = image;

		setScopedAttribute("image", image);
	}

	public void setImageAnim(java.lang.Object imageAnim) {
		_imageAnim = imageAnim;

		setScopedAttribute("imageAnim", imageAnim);
	}

	public void setInfoEl(java.lang.String infoEl) {
		_infoEl = infoEl;

		setScopedAttribute("infoEl", infoEl);
	}

	public void setInfoTemplate(java.lang.String infoTemplate) {
		_infoTemplate = infoTemplate;

		setScopedAttribute("infoTemplate", infoTemplate);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setLinks(java.lang.String links) {
		_links = links;

		setScopedAttribute("links", links);
	}

	public void setLoader(java.lang.String loader) {
		_loader = loader;

		setScopedAttribute("loader", loader);
	}

	public void setLoading(java.lang.Boolean loading) {
		_loading = loading;

		setScopedAttribute("loading", loading);
	}

	public void setLoadingEl(java.lang.String loadingEl) {
		_loadingEl = loadingEl;

		setScopedAttribute("loadingEl", loadingEl);
	}

	public void setMaxHeight(java.lang.Number maxHeight) {
		_maxHeight = maxHeight;

		setScopedAttribute("maxHeight", maxHeight);
	}

	public void setMaxWidth(java.lang.Number maxWidth) {
		_maxWidth = maxWidth;

		setScopedAttribute("maxWidth", maxWidth);
	}

	public void setModal(java.lang.String modal) {
		_modal = modal;

		setScopedAttribute("modal", modal);
	}

	public void setPreloadAllImages(java.lang.Boolean preloadAllImages) {
		_preloadAllImages = preloadAllImages;

		setScopedAttribute("preloadAllImages", preloadAllImages);
	}

	public void setRender(java.lang.Boolean render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(java.lang.Boolean rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setShowArrows(java.lang.Boolean showArrows) {
		_showArrows = showArrows;

		setScopedAttribute("showArrows", showArrows);
	}

	public void setShowClose(java.lang.Boolean showClose) {
		_showClose = showClose;

		setScopedAttribute("showClose", showClose);
	}

	public void setSrcNode(java.lang.String srcNode) {
		_srcNode = srcNode;

		setScopedAttribute("srcNode", srcNode);
	}

	public void setStrings(java.lang.Object strings) {
		_strings = strings;

		setScopedAttribute("strings", strings);
	}

	public void setTabIndex(java.lang.Number tabIndex) {
		_tabIndex = tabIndex;

		setScopedAttribute("tabIndex", tabIndex);
	}

	public void setTotalLinks(java.lang.Boolean totalLinks) {
		_totalLinks = totalLinks;

		setScopedAttribute("totalLinks", totalLinks);
	}

	public void setVisible(java.lang.Boolean visible) {
		_visible = visible;

		setScopedAttribute("visible", visible);
	}

	public void setWidth(java.lang.String width) {
		_width = width;

		setScopedAttribute("width", width);
	}

	public void setAfterAnim(java.lang.String afterAnim) {
		_afterAnim = afterAnim;

		setScopedAttribute("afterAnim", afterAnim);
	}

	public void setAfterAnimChange(java.lang.String afterAnimChange) {
		_afterAnimChange = afterAnimChange;

		setScopedAttribute("afterAnimChange", afterAnimChange);
	}

	public void setAfterArrowLeftElChange(java.lang.String afterArrowLeftElChange) {
		_afterArrowLeftElChange = afterArrowLeftElChange;

		setScopedAttribute("afterArrowLeftElChange", afterArrowLeftElChange);
	}

	public void setAfterArrowRightElChange(java.lang.String afterArrowRightElChange) {
		_afterArrowRightElChange = afterArrowRightElChange;

		setScopedAttribute("afterArrowRightElChange", afterArrowRightElChange);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterCaptionChange(java.lang.String afterCaptionChange) {
		_afterCaptionChange = afterCaptionChange;

		setScopedAttribute("afterCaptionChange", afterCaptionChange);
	}

	public void setAfterCaptionElChange(java.lang.String afterCaptionElChange) {
		_afterCaptionElChange = afterCaptionElChange;

		setScopedAttribute("afterCaptionElChange", afterCaptionElChange);
	}

	public void setAfterCaptionFromTitleChange(java.lang.String afterCaptionFromTitleChange) {
		_afterCaptionFromTitleChange = afterCaptionFromTitleChange;

		setScopedAttribute("afterCaptionFromTitleChange", afterCaptionFromTitleChange);
	}

	public void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		_afterCenteredChange = afterCenteredChange;

		setScopedAttribute("afterCenteredChange", afterCenteredChange);
	}

	public void setAfterCloseElChange(java.lang.String afterCloseElChange) {
		_afterCloseElChange = afterCloseElChange;

		setScopedAttribute("afterCloseElChange", afterCloseElChange);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		_afterCssClassChange = afterCssClassChange;

		setScopedAttribute("afterCssClassChange", afterCssClassChange);
	}

	public void setAfterCurrentIndexChange(java.lang.String afterCurrentIndexChange) {
		_afterCurrentIndexChange = afterCurrentIndexChange;

		setScopedAttribute("afterCurrentIndexChange", afterCurrentIndexChange);
	}

	public void setAfterDestroy(java.lang.String afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		_afterDisabledChange = afterDisabledChange;

		setScopedAttribute("afterDisabledChange", afterDisabledChange);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		_afterFocusedChange = afterFocusedChange;

		setScopedAttribute("afterFocusedChange", afterFocusedChange);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		_afterHeightChange = afterHeightChange;

		setScopedAttribute("afterHeightChange", afterHeightChange);
	}

	public void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		_afterHideClassChange = afterHideClassChange;

		setScopedAttribute("afterHideClassChange", afterHideClassChange);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		_afterIdChange = afterIdChange;

		setScopedAttribute("afterIdChange", afterIdChange);
	}

	public void setAfterImageAnimChange(java.lang.String afterImageAnimChange) {
		_afterImageAnimChange = afterImageAnimChange;

		setScopedAttribute("afterImageAnimChange", afterImageAnimChange);
	}

	public void setAfterImageChange(java.lang.String afterImageChange) {
		_afterImageChange = afterImageChange;

		setScopedAttribute("afterImageChange", afterImageChange);
	}

	public void setAfterInfoElChange(java.lang.String afterInfoElChange) {
		_afterInfoElChange = afterInfoElChange;

		setScopedAttribute("afterInfoElChange", afterInfoElChange);
	}

	public void setAfterInfoTemplateChange(java.lang.String afterInfoTemplateChange) {
		_afterInfoTemplateChange = afterInfoTemplateChange;

		setScopedAttribute("afterInfoTemplateChange", afterInfoTemplateChange);
	}

	public void setAfterInit(java.lang.String afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterLinksChange(java.lang.String afterLinksChange) {
		_afterLinksChange = afterLinksChange;

		setScopedAttribute("afterLinksChange", afterLinksChange);
	}

	public void setAfterLoad(java.lang.String afterLoad) {
		_afterLoad = afterLoad;

		setScopedAttribute("afterLoad", afterLoad);
	}

	public void setAfterLoaderChange(java.lang.String afterLoaderChange) {
		_afterLoaderChange = afterLoaderChange;

		setScopedAttribute("afterLoaderChange", afterLoaderChange);
	}

	public void setAfterLoadingChange(java.lang.String afterLoadingChange) {
		_afterLoadingChange = afterLoadingChange;

		setScopedAttribute("afterLoadingChange", afterLoadingChange);
	}

	public void setAfterLoadingElChange(java.lang.String afterLoadingElChange) {
		_afterLoadingElChange = afterLoadingElChange;

		setScopedAttribute("afterLoadingElChange", afterLoadingElChange);
	}

	public void setAfterMaxHeightChange(java.lang.String afterMaxHeightChange) {
		_afterMaxHeightChange = afterMaxHeightChange;

		setScopedAttribute("afterMaxHeightChange", afterMaxHeightChange);
	}

	public void setAfterMaxWidthChange(java.lang.String afterMaxWidthChange) {
		_afterMaxWidthChange = afterMaxWidthChange;

		setScopedAttribute("afterMaxWidthChange", afterMaxWidthChange);
	}

	public void setAfterModalChange(java.lang.String afterModalChange) {
		_afterModalChange = afterModalChange;

		setScopedAttribute("afterModalChange", afterModalChange);
	}

	public void setAfterPreloadAllImagesChange(java.lang.String afterPreloadAllImagesChange) {
		_afterPreloadAllImagesChange = afterPreloadAllImagesChange;

		setScopedAttribute("afterPreloadAllImagesChange", afterPreloadAllImagesChange);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterRequest(java.lang.String afterRequest) {
		_afterRequest = afterRequest;

		setScopedAttribute("afterRequest", afterRequest);
	}

	public void setAfterShowArrowsChange(java.lang.String afterShowArrowsChange) {
		_afterShowArrowsChange = afterShowArrowsChange;

		setScopedAttribute("afterShowArrowsChange", afterShowArrowsChange);
	}

	public void setAfterShowCloseChange(java.lang.String afterShowCloseChange) {
		_afterShowCloseChange = afterShowCloseChange;

		setScopedAttribute("afterShowCloseChange", afterShowCloseChange);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		_afterSrcNodeChange = afterSrcNodeChange;

		setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		_afterStringsChange = afterStringsChange;

		setScopedAttribute("afterStringsChange", afterStringsChange);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		_afterTabIndexChange = afterTabIndexChange;

		setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
	}

	public void setAfterTotalLinksChange(java.lang.String afterTotalLinksChange) {
		_afterTotalLinksChange = afterTotalLinksChange;

		setScopedAttribute("afterTotalLinksChange", afterTotalLinksChange);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		_afterVisibleChange = afterVisibleChange;

		setScopedAttribute("afterVisibleChange", afterVisibleChange);
	}

	public void setAfterContentUpdate(java.lang.String afterContentUpdate) {
		_afterContentUpdate = afterContentUpdate;

		setScopedAttribute("afterContentUpdate", afterContentUpdate);
	}

	public void setAfterRender(java.lang.String afterRender) {
		_afterRender = afterRender;

		setScopedAttribute("afterRender", afterRender);
	}

	public void setAfterWidthChange(java.lang.String afterWidthChange) {
		_afterWidthChange = afterWidthChange;

		setScopedAttribute("afterWidthChange", afterWidthChange);
	}

	public void setOnAnim(java.lang.String onAnim) {
		_onAnim = onAnim;

		setScopedAttribute("onAnim", onAnim);
	}

	public void setOnAnimChange(java.lang.String onAnimChange) {
		_onAnimChange = onAnimChange;

		setScopedAttribute("onAnimChange", onAnimChange);
	}

	public void setOnArrowLeftElChange(java.lang.String onArrowLeftElChange) {
		_onArrowLeftElChange = onArrowLeftElChange;

		setScopedAttribute("onArrowLeftElChange", onArrowLeftElChange);
	}

	public void setOnArrowRightElChange(java.lang.String onArrowRightElChange) {
		_onArrowRightElChange = onArrowRightElChange;

		setScopedAttribute("onArrowRightElChange", onArrowRightElChange);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnCaptionChange(java.lang.String onCaptionChange) {
		_onCaptionChange = onCaptionChange;

		setScopedAttribute("onCaptionChange", onCaptionChange);
	}

	public void setOnCaptionElChange(java.lang.String onCaptionElChange) {
		_onCaptionElChange = onCaptionElChange;

		setScopedAttribute("onCaptionElChange", onCaptionElChange);
	}

	public void setOnCaptionFromTitleChange(java.lang.String onCaptionFromTitleChange) {
		_onCaptionFromTitleChange = onCaptionFromTitleChange;

		setScopedAttribute("onCaptionFromTitleChange", onCaptionFromTitleChange);
	}

	public void setOnCenteredChange(java.lang.String onCenteredChange) {
		_onCenteredChange = onCenteredChange;

		setScopedAttribute("onCenteredChange", onCenteredChange);
	}

	public void setOnCloseElChange(java.lang.String onCloseElChange) {
		_onCloseElChange = onCloseElChange;

		setScopedAttribute("onCloseElChange", onCloseElChange);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnCssClassChange(java.lang.String onCssClassChange) {
		_onCssClassChange = onCssClassChange;

		setScopedAttribute("onCssClassChange", onCssClassChange);
	}

	public void setOnCurrentIndexChange(java.lang.String onCurrentIndexChange) {
		_onCurrentIndexChange = onCurrentIndexChange;

		setScopedAttribute("onCurrentIndexChange", onCurrentIndexChange);
	}

	public void setOnDestroy(java.lang.String onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		_onDisabledChange = onDisabledChange;

		setScopedAttribute("onDisabledChange", onDisabledChange);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		_onFocusedChange = onFocusedChange;

		setScopedAttribute("onFocusedChange", onFocusedChange);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		_onHeightChange = onHeightChange;

		setScopedAttribute("onHeightChange", onHeightChange);
	}

	public void setOnHideClassChange(java.lang.String onHideClassChange) {
		_onHideClassChange = onHideClassChange;

		setScopedAttribute("onHideClassChange", onHideClassChange);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		_onIdChange = onIdChange;

		setScopedAttribute("onIdChange", onIdChange);
	}

	public void setOnImageAnimChange(java.lang.String onImageAnimChange) {
		_onImageAnimChange = onImageAnimChange;

		setScopedAttribute("onImageAnimChange", onImageAnimChange);
	}

	public void setOnImageChange(java.lang.String onImageChange) {
		_onImageChange = onImageChange;

		setScopedAttribute("onImageChange", onImageChange);
	}

	public void setOnInfoElChange(java.lang.String onInfoElChange) {
		_onInfoElChange = onInfoElChange;

		setScopedAttribute("onInfoElChange", onInfoElChange);
	}

	public void setOnInfoTemplateChange(java.lang.String onInfoTemplateChange) {
		_onInfoTemplateChange = onInfoTemplateChange;

		setScopedAttribute("onInfoTemplateChange", onInfoTemplateChange);
	}

	public void setOnInit(java.lang.String onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnLinksChange(java.lang.String onLinksChange) {
		_onLinksChange = onLinksChange;

		setScopedAttribute("onLinksChange", onLinksChange);
	}

	public void setOnLoad(java.lang.String onLoad) {
		_onLoad = onLoad;

		setScopedAttribute("onLoad", onLoad);
	}

	public void setOnLoaderChange(java.lang.String onLoaderChange) {
		_onLoaderChange = onLoaderChange;

		setScopedAttribute("onLoaderChange", onLoaderChange);
	}

	public void setOnLoadingChange(java.lang.String onLoadingChange) {
		_onLoadingChange = onLoadingChange;

		setScopedAttribute("onLoadingChange", onLoadingChange);
	}

	public void setOnLoadingElChange(java.lang.String onLoadingElChange) {
		_onLoadingElChange = onLoadingElChange;

		setScopedAttribute("onLoadingElChange", onLoadingElChange);
	}

	public void setOnMaxHeightChange(java.lang.String onMaxHeightChange) {
		_onMaxHeightChange = onMaxHeightChange;

		setScopedAttribute("onMaxHeightChange", onMaxHeightChange);
	}

	public void setOnMaxWidthChange(java.lang.String onMaxWidthChange) {
		_onMaxWidthChange = onMaxWidthChange;

		setScopedAttribute("onMaxWidthChange", onMaxWidthChange);
	}

	public void setOnModalChange(java.lang.String onModalChange) {
		_onModalChange = onModalChange;

		setScopedAttribute("onModalChange", onModalChange);
	}

	public void setOnPreloadAllImagesChange(java.lang.String onPreloadAllImagesChange) {
		_onPreloadAllImagesChange = onPreloadAllImagesChange;

		setScopedAttribute("onPreloadAllImagesChange", onPreloadAllImagesChange);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnRequest(java.lang.String onRequest) {
		_onRequest = onRequest;

		setScopedAttribute("onRequest", onRequest);
	}

	public void setOnShowArrowsChange(java.lang.String onShowArrowsChange) {
		_onShowArrowsChange = onShowArrowsChange;

		setScopedAttribute("onShowArrowsChange", onShowArrowsChange);
	}

	public void setOnShowCloseChange(java.lang.String onShowCloseChange) {
		_onShowCloseChange = onShowCloseChange;

		setScopedAttribute("onShowCloseChange", onShowCloseChange);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		_onSrcNodeChange = onSrcNodeChange;

		setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		_onStringsChange = onStringsChange;

		setScopedAttribute("onStringsChange", onStringsChange);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		_onTabIndexChange = onTabIndexChange;

		setScopedAttribute("onTabIndexChange", onTabIndexChange);
	}

	public void setOnTotalLinksChange(java.lang.String onTotalLinksChange) {
		_onTotalLinksChange = onTotalLinksChange;

		setScopedAttribute("onTotalLinksChange", onTotalLinksChange);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		_onVisibleChange = onVisibleChange;

		setScopedAttribute("onVisibleChange", onVisibleChange);
	}

	public void setOnContentUpdate(java.lang.String onContentUpdate) {
		_onContentUpdate = onContentUpdate;

		setScopedAttribute("onContentUpdate", onContentUpdate);
	}

	public void setOnRender(java.lang.String onRender) {
		_onRender = onRender;

		setScopedAttribute("onRender", onRender);
	}

	public void setOnWidthChange(java.lang.String onWidthChange) {
		_onWidthChange = onWidthChange;

		setScopedAttribute("onWidthChange", onWidthChange);
	}


	protected void _setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "anim", _anim);
		setNamespacedAttribute(request, "arrowLeftEl", _arrowLeftEl);
		setNamespacedAttribute(request, "arrowRightEl", _arrowRightEl);
		setNamespacedAttribute(request, "boundingBox", _boundingBox);
		setNamespacedAttribute(request, "caption", _caption);
		setNamespacedAttribute(request, "captionEl", _captionEl);
		setNamespacedAttribute(request, "captionFromTitle", _captionFromTitle);
		setNamespacedAttribute(request, "centered", _centered);
		setNamespacedAttribute(request, "closeEl", _closeEl);
		setNamespacedAttribute(request, "contentBox", _contentBox);
		setNamespacedAttribute(request, "cssClass", _cssClass);
		setNamespacedAttribute(request, "currentIndex", _currentIndex);
		setNamespacedAttribute(request, "destroyed", _destroyed);
		setNamespacedAttribute(request, "disabled", _disabled);
		setNamespacedAttribute(request, "focused", _focused);
		setNamespacedAttribute(request, "height", _height);
		setNamespacedAttribute(request, "hideClass", _hideClass);
		setNamespacedAttribute(request, "imageviewerId", _imageviewerId);
		setNamespacedAttribute(request, "image", _image);
		setNamespacedAttribute(request, "imageAnim", _imageAnim);
		setNamespacedAttribute(request, "infoEl", _infoEl);
		setNamespacedAttribute(request, "infoTemplate", _infoTemplate);
		setNamespacedAttribute(request, "initialized", _initialized);
		setNamespacedAttribute(request, "links", _links);
		setNamespacedAttribute(request, "loader", _loader);
		setNamespacedAttribute(request, "loading", _loading);
		setNamespacedAttribute(request, "loadingEl", _loadingEl);
		setNamespacedAttribute(request, "maxHeight", _maxHeight);
		setNamespacedAttribute(request, "maxWidth", _maxWidth);
		setNamespacedAttribute(request, "modal", _modal);
		setNamespacedAttribute(request, "preloadAllImages", _preloadAllImages);
		setNamespacedAttribute(request, "render", _render);
		setNamespacedAttribute(request, "rendered", _rendered);
		setNamespacedAttribute(request, "showArrows", _showArrows);
		setNamespacedAttribute(request, "showClose", _showClose);
		setNamespacedAttribute(request, "srcNode", _srcNode);
		setNamespacedAttribute(request, "strings", _strings);
		setNamespacedAttribute(request, "tabIndex", _tabIndex);
		setNamespacedAttribute(request, "totalLinks", _totalLinks);
		setNamespacedAttribute(request, "visible", _visible);
		setNamespacedAttribute(request, "width", _width);
		setNamespacedAttribute(request, "afterAnim", _afterAnim);
		setNamespacedAttribute(request, "afterAnimChange", _afterAnimChange);
		setNamespacedAttribute(request, "afterArrowLeftElChange", _afterArrowLeftElChange);
		setNamespacedAttribute(request, "afterArrowRightElChange", _afterArrowRightElChange);
		setNamespacedAttribute(request, "afterBoundingBoxChange", _afterBoundingBoxChange);
		setNamespacedAttribute(request, "afterCaptionChange", _afterCaptionChange);
		setNamespacedAttribute(request, "afterCaptionElChange", _afterCaptionElChange);
		setNamespacedAttribute(request, "afterCaptionFromTitleChange", _afterCaptionFromTitleChange);
		setNamespacedAttribute(request, "afterCenteredChange", _afterCenteredChange);
		setNamespacedAttribute(request, "afterCloseElChange", _afterCloseElChange);
		setNamespacedAttribute(request, "afterContentBoxChange", _afterContentBoxChange);
		setNamespacedAttribute(request, "afterCssClassChange", _afterCssClassChange);
		setNamespacedAttribute(request, "afterCurrentIndexChange", _afterCurrentIndexChange);
		setNamespacedAttribute(request, "afterDestroy", _afterDestroy);
		setNamespacedAttribute(request, "afterDestroyedChange", _afterDestroyedChange);
		setNamespacedAttribute(request, "afterDisabledChange", _afterDisabledChange);
		setNamespacedAttribute(request, "afterFocusedChange", _afterFocusedChange);
		setNamespacedAttribute(request, "afterHeightChange", _afterHeightChange);
		setNamespacedAttribute(request, "afterHideClassChange", _afterHideClassChange);
		setNamespacedAttribute(request, "afterIdChange", _afterIdChange);
		setNamespacedAttribute(request, "afterImageAnimChange", _afterImageAnimChange);
		setNamespacedAttribute(request, "afterImageChange", _afterImageChange);
		setNamespacedAttribute(request, "afterInfoElChange", _afterInfoElChange);
		setNamespacedAttribute(request, "afterInfoTemplateChange", _afterInfoTemplateChange);
		setNamespacedAttribute(request, "afterInit", _afterInit);
		setNamespacedAttribute(request, "afterInitializedChange", _afterInitializedChange);
		setNamespacedAttribute(request, "afterLinksChange", _afterLinksChange);
		setNamespacedAttribute(request, "afterLoad", _afterLoad);
		setNamespacedAttribute(request, "afterLoaderChange", _afterLoaderChange);
		setNamespacedAttribute(request, "afterLoadingChange", _afterLoadingChange);
		setNamespacedAttribute(request, "afterLoadingElChange", _afterLoadingElChange);
		setNamespacedAttribute(request, "afterMaxHeightChange", _afterMaxHeightChange);
		setNamespacedAttribute(request, "afterMaxWidthChange", _afterMaxWidthChange);
		setNamespacedAttribute(request, "afterModalChange", _afterModalChange);
		setNamespacedAttribute(request, "afterPreloadAllImagesChange", _afterPreloadAllImagesChange);
		setNamespacedAttribute(request, "afterRenderChange", _afterRenderChange);
		setNamespacedAttribute(request, "afterRenderedChange", _afterRenderedChange);
		setNamespacedAttribute(request, "afterRequest", _afterRequest);
		setNamespacedAttribute(request, "afterShowArrowsChange", _afterShowArrowsChange);
		setNamespacedAttribute(request, "afterShowCloseChange", _afterShowCloseChange);
		setNamespacedAttribute(request, "afterSrcNodeChange", _afterSrcNodeChange);
		setNamespacedAttribute(request, "afterStringsChange", _afterStringsChange);
		setNamespacedAttribute(request, "afterTabIndexChange", _afterTabIndexChange);
		setNamespacedAttribute(request, "afterTotalLinksChange", _afterTotalLinksChange);
		setNamespacedAttribute(request, "afterVisibleChange", _afterVisibleChange);
		setNamespacedAttribute(request, "afterContentUpdate", _afterContentUpdate);
		setNamespacedAttribute(request, "afterRender", _afterRender);
		setNamespacedAttribute(request, "afterWidthChange", _afterWidthChange);
		setNamespacedAttribute(request, "onAnim", _onAnim);
		setNamespacedAttribute(request, "onAnimChange", _onAnimChange);
		setNamespacedAttribute(request, "onArrowLeftElChange", _onArrowLeftElChange);
		setNamespacedAttribute(request, "onArrowRightElChange", _onArrowRightElChange);
		setNamespacedAttribute(request, "onBoundingBoxChange", _onBoundingBoxChange);
		setNamespacedAttribute(request, "onCaptionChange", _onCaptionChange);
		setNamespacedAttribute(request, "onCaptionElChange", _onCaptionElChange);
		setNamespacedAttribute(request, "onCaptionFromTitleChange", _onCaptionFromTitleChange);
		setNamespacedAttribute(request, "onCenteredChange", _onCenteredChange);
		setNamespacedAttribute(request, "onCloseElChange", _onCloseElChange);
		setNamespacedAttribute(request, "onContentBoxChange", _onContentBoxChange);
		setNamespacedAttribute(request, "onCssClassChange", _onCssClassChange);
		setNamespacedAttribute(request, "onCurrentIndexChange", _onCurrentIndexChange);
		setNamespacedAttribute(request, "onDestroy", _onDestroy);
		setNamespacedAttribute(request, "onDestroyedChange", _onDestroyedChange);
		setNamespacedAttribute(request, "onDisabledChange", _onDisabledChange);
		setNamespacedAttribute(request, "onFocusedChange", _onFocusedChange);
		setNamespacedAttribute(request, "onHeightChange", _onHeightChange);
		setNamespacedAttribute(request, "onHideClassChange", _onHideClassChange);
		setNamespacedAttribute(request, "onIdChange", _onIdChange);
		setNamespacedAttribute(request, "onImageAnimChange", _onImageAnimChange);
		setNamespacedAttribute(request, "onImageChange", _onImageChange);
		setNamespacedAttribute(request, "onInfoElChange", _onInfoElChange);
		setNamespacedAttribute(request, "onInfoTemplateChange", _onInfoTemplateChange);
		setNamespacedAttribute(request, "onInit", _onInit);
		setNamespacedAttribute(request, "onInitializedChange", _onInitializedChange);
		setNamespacedAttribute(request, "onLinksChange", _onLinksChange);
		setNamespacedAttribute(request, "onLoad", _onLoad);
		setNamespacedAttribute(request, "onLoaderChange", _onLoaderChange);
		setNamespacedAttribute(request, "onLoadingChange", _onLoadingChange);
		setNamespacedAttribute(request, "onLoadingElChange", _onLoadingElChange);
		setNamespacedAttribute(request, "onMaxHeightChange", _onMaxHeightChange);
		setNamespacedAttribute(request, "onMaxWidthChange", _onMaxWidthChange);
		setNamespacedAttribute(request, "onModalChange", _onModalChange);
		setNamespacedAttribute(request, "onPreloadAllImagesChange", _onPreloadAllImagesChange);
		setNamespacedAttribute(request, "onRenderChange", _onRenderChange);
		setNamespacedAttribute(request, "onRenderedChange", _onRenderedChange);
		setNamespacedAttribute(request, "onRequest", _onRequest);
		setNamespacedAttribute(request, "onShowArrowsChange", _onShowArrowsChange);
		setNamespacedAttribute(request, "onShowCloseChange", _onShowCloseChange);
		setNamespacedAttribute(request, "onSrcNodeChange", _onSrcNodeChange);
		setNamespacedAttribute(request, "onStringsChange", _onStringsChange);
		setNamespacedAttribute(request, "onTabIndexChange", _onTabIndexChange);
		setNamespacedAttribute(request, "onTotalLinksChange", _onTotalLinksChange);
		setNamespacedAttribute(request, "onVisibleChange", _onVisibleChange);
		setNamespacedAttribute(request, "onContentUpdate", _onContentUpdate);
		setNamespacedAttribute(request, "onRender", _onRender);
		setNamespacedAttribute(request, "onWidthChange", _onWidthChange);
	}

	private static final String _ATTRIBUTE_NAMESPACE = "alloy:image-viewer:";

	private static final String _PAGE =
		"/html/taglib/alloy/image_viewer/page.jsp";

	private java.lang.Boolean _anim;
	private java.lang.String _arrowLeftEl;
	private java.lang.String _arrowRightEl;
	private java.lang.String _boundingBox;
	private java.lang.String _caption;
	private java.lang.String _captionEl;
	private java.lang.Boolean _captionFromTitle;
	private java.lang.Boolean _centered;
	private java.lang.String _closeEl;
	private java.lang.String _contentBox;
	private java.lang.String _cssClass;
	private java.lang.Number _currentIndex;
	private java.lang.Boolean _destroyed;
	private java.lang.Boolean _disabled;
	private java.lang.Boolean _focused;
	private java.lang.String _height;
	private java.lang.String _hideClass;
	private java.lang.String _imageviewerId;
	private java.lang.String _image;
	private java.lang.Object _imageAnim;
	private java.lang.String _infoEl;
	private java.lang.String _infoTemplate;
	private java.lang.Boolean _initialized;
	private java.lang.String _links;
	private java.lang.String _loader;
	private java.lang.Boolean _loading;
	private java.lang.String _loadingEl;
	private java.lang.Number _maxHeight;
	private java.lang.Number _maxWidth;
	private java.lang.String _modal;
	private java.lang.Boolean _preloadAllImages;
	private java.lang.Boolean _render;
	private java.lang.Boolean _rendered;
	private java.lang.Boolean _showArrows;
	private java.lang.Boolean _showClose;
	private java.lang.String _srcNode;
	private java.lang.Object _strings;
	private java.lang.Number _tabIndex;
	private java.lang.Boolean _totalLinks;
	private java.lang.Boolean _visible;
	private java.lang.String _width;
	private java.lang.String _afterAnim;
	private java.lang.String _afterAnimChange;
	private java.lang.String _afterArrowLeftElChange;
	private java.lang.String _afterArrowRightElChange;
	private java.lang.String _afterBoundingBoxChange;
	private java.lang.String _afterCaptionChange;
	private java.lang.String _afterCaptionElChange;
	private java.lang.String _afterCaptionFromTitleChange;
	private java.lang.String _afterCenteredChange;
	private java.lang.String _afterCloseElChange;
	private java.lang.String _afterContentBoxChange;
	private java.lang.String _afterCssClassChange;
	private java.lang.String _afterCurrentIndexChange;
	private java.lang.String _afterDestroy;
	private java.lang.String _afterDestroyedChange;
	private java.lang.String _afterDisabledChange;
	private java.lang.String _afterFocusedChange;
	private java.lang.String _afterHeightChange;
	private java.lang.String _afterHideClassChange;
	private java.lang.String _afterIdChange;
	private java.lang.String _afterImageAnimChange;
	private java.lang.String _afterImageChange;
	private java.lang.String _afterInfoElChange;
	private java.lang.String _afterInfoTemplateChange;
	private java.lang.String _afterInit;
	private java.lang.String _afterInitializedChange;
	private java.lang.String _afterLinksChange;
	private java.lang.String _afterLoad;
	private java.lang.String _afterLoaderChange;
	private java.lang.String _afterLoadingChange;
	private java.lang.String _afterLoadingElChange;
	private java.lang.String _afterMaxHeightChange;
	private java.lang.String _afterMaxWidthChange;
	private java.lang.String _afterModalChange;
	private java.lang.String _afterPreloadAllImagesChange;
	private java.lang.String _afterRenderChange;
	private java.lang.String _afterRenderedChange;
	private java.lang.String _afterRequest;
	private java.lang.String _afterShowArrowsChange;
	private java.lang.String _afterShowCloseChange;
	private java.lang.String _afterSrcNodeChange;
	private java.lang.String _afterStringsChange;
	private java.lang.String _afterTabIndexChange;
	private java.lang.String _afterTotalLinksChange;
	private java.lang.String _afterVisibleChange;
	private java.lang.String _afterContentUpdate;
	private java.lang.String _afterRender;
	private java.lang.String _afterWidthChange;
	private java.lang.String _onAnim;
	private java.lang.String _onAnimChange;
	private java.lang.String _onArrowLeftElChange;
	private java.lang.String _onArrowRightElChange;
	private java.lang.String _onBoundingBoxChange;
	private java.lang.String _onCaptionChange;
	private java.lang.String _onCaptionElChange;
	private java.lang.String _onCaptionFromTitleChange;
	private java.lang.String _onCenteredChange;
	private java.lang.String _onCloseElChange;
	private java.lang.String _onContentBoxChange;
	private java.lang.String _onCssClassChange;
	private java.lang.String _onCurrentIndexChange;
	private java.lang.String _onDestroy;
	private java.lang.String _onDestroyedChange;
	private java.lang.String _onDisabledChange;
	private java.lang.String _onFocusedChange;
	private java.lang.String _onHeightChange;
	private java.lang.String _onHideClassChange;
	private java.lang.String _onIdChange;
	private java.lang.String _onImageAnimChange;
	private java.lang.String _onImageChange;
	private java.lang.String _onInfoElChange;
	private java.lang.String _onInfoTemplateChange;
	private java.lang.String _onInit;
	private java.lang.String _onInitializedChange;
	private java.lang.String _onLinksChange;
	private java.lang.String _onLoad;
	private java.lang.String _onLoaderChange;
	private java.lang.String _onLoadingChange;
	private java.lang.String _onLoadingElChange;
	private java.lang.String _onMaxHeightChange;
	private java.lang.String _onMaxWidthChange;
	private java.lang.String _onModalChange;
	private java.lang.String _onPreloadAllImagesChange;
	private java.lang.String _onRenderChange;
	private java.lang.String _onRenderedChange;
	private java.lang.String _onRequest;
	private java.lang.String _onShowArrowsChange;
	private java.lang.String _onShowCloseChange;
	private java.lang.String _onSrcNodeChange;
	private java.lang.String _onStringsChange;
	private java.lang.String _onTabIndexChange;
	private java.lang.String _onTotalLinksChange;
	private java.lang.String _onVisibleChange;
	private java.lang.String _onContentUpdate;
	private java.lang.String _onRender;
	private java.lang.String _onWidthChange;

}