package com.example.compositexample;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.Slider;
import com.vaadin.ui.VerticalSplitPanel;

public class CompWindows extends CustomComponent 
{

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private Accordion acc_ord;
	@AutoGenerated
	private Accordion accordion_123;
	@AutoGenerated
	private GridLayout gridLayout_4;
	@AutoGenerated
	private VerticalSplitPanel verticalSplitPanel_1;
	@AutoGenerated
	private GridLayout gridLayout_6;
	@AutoGenerated
	private Slider slider_1;
	@AutoGenerated
	private GridLayout gridLayout_7;
	@AutoGenerated
	private RichTextArea richTextArea_1;
	@AutoGenerated
	private GridLayout gridLayout_8;
	@AutoGenerated
	private PopupDateField popupDateField_2;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public CompWindows() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setCaption("Horizontal Layout");
		mainLayout.setImmediate(false);
		mainLayout.setWidth("640px");
		mainLayout.setHeight("440px");
		
		// top-level component properties
		setWidth("640px");
		setHeight("440px");
		
		// accordion_123
		accordion_123 = buildAccordion_123();
		mainLayout.addComponent(accordion_123, "top:180.0px;left:0.0px;");
		
		// acc_ord
		acc_ord = new Accordion();
		acc_ord.setCaption("���������");
		acc_ord.setImmediate(false);
		acc_ord.setWidth("640px");
		acc_ord.setHeight("-1px");
		mainLayout.addComponent(acc_ord, "top:0.0px;left:0.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private Accordion buildAccordion_123() {
		// common part: create layout
		accordion_123 = new Accordion();
		accordion_123.setImmediate(true);
		accordion_123.setWidth("460px");
		accordion_123.setHeight("260px");
		
		// gridLayout_8
		gridLayout_8 = buildGridLayout_8();
		accordion_123.addTab(gridLayout_8, "Tab", null);
		
		// gridLayout_7
		gridLayout_7 = buildGridLayout_7();
		accordion_123.addTab(gridLayout_7, "Tab", null);
		
		// gridLayout_6
		gridLayout_6 = buildGridLayout_6();
		accordion_123.addTab(gridLayout_6, "Tab", null);
		
		// verticalSplitPanel_1
		verticalSplitPanel_1 = new VerticalSplitPanel();
		verticalSplitPanel_1.setImmediate(false);
		verticalSplitPanel_1.setWidth("100.0%");
		verticalSplitPanel_1.setHeight("100.0%");
		accordion_123.addTab(verticalSplitPanel_1, "Tab", null);
		
		// gridLayout_4
		gridLayout_4 = new GridLayout();
		gridLayout_4.setImmediate(false);
		gridLayout_4.setWidth("100.0%");
		gridLayout_4.setHeight("100.0%");
		gridLayout_4.setMargin(false);
		accordion_123.addTab(gridLayout_4, "Tab", null);
		
		return accordion_123;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_8() {
		// common part: create layout
		gridLayout_8 = new GridLayout();
		gridLayout_8.setImmediate(false);
		gridLayout_8.setWidth("100.0%");
		gridLayout_8.setHeight("100.0%");
		gridLayout_8.setMargin(false);
		
		// popupDateField_2
		popupDateField_2 = new PopupDateField();
		popupDateField_2.setImmediate(false);
		popupDateField_2.setWidth("-1px");
		popupDateField_2.setHeight("-1px");
		gridLayout_8.addComponent(popupDateField_2, 0, 0);
		
		return gridLayout_8;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_7() {
		// common part: create layout
		gridLayout_7 = new GridLayout();
		gridLayout_7.setImmediate(false);
		gridLayout_7.setWidth("100.0%");
		gridLayout_7.setHeight("100.0%");
		gridLayout_7.setMargin(false);
		
		// richTextArea_1
		richTextArea_1 = new RichTextArea();
		richTextArea_1.setImmediate(false);
		richTextArea_1.setWidth("-1px");
		richTextArea_1.setHeight("-1px");
		gridLayout_7.addComponent(richTextArea_1, 0, 0);
		
		return gridLayout_7;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_6() {
		// common part: create layout
		gridLayout_6 = new GridLayout();
		gridLayout_6.setImmediate(false);
		gridLayout_6.setWidth("100.0%");
		gridLayout_6.setHeight("100.0%");
		gridLayout_6.setMargin(false);
		
		// slider_1
		slider_1 = new Slider();
		slider_1.setImmediate(false);
		slider_1.setWidth("-1px");
		slider_1.setHeight("-1px");
		gridLayout_6.addComponent(slider_1, 0, 0);
		
		return gridLayout_6;
	}

}