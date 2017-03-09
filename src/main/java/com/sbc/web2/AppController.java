package com.sbc.web2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbc.web2.form.CalcForm;

@Controller
public class AppController {

	//-------------------------
	// 画面
	//-------------------------
	@RequestMapping("/")
	public String index(){
		return "index";
	}

	@RequestMapping("/second")
	public String second(){
		return "second";
	}

	@RequestMapping("/calc")
	public String calc(@ModelAttribute CalcForm form, Model model){

		// 値１と値２を足した結果を算出する
		String ans = calcLogic(form);

		// 画面表示項目設定
		model.addAttribute("form", form);
		model.addAttribute("ans", ans);

		// calc画面を表示
		return "calc";
	}

	@RequestMapping("/calc2")
	@ResponseBody
	public String calc2(@ModelAttribute CalcForm form){

		// 値１と値２を足した結果を返却する
		return calcLogic(form);
	}

	/**
	 * 値１と値２を足した結果を算出する
	 *
	 * @param form 計算フォーム
	 * @return 足し算の結果
	 */
	private String calcLogic(CalcForm form){

		String ans = null;
		try{
			// 入力された値１・値２を数値に変換
			int val1 = convertToNumber(form.getVal1());
			int val2 = convertToNumber(form.getVal2());

			// 計算（足し算）
			int result = val1 + val2;

			// 結果を文字列に変換
			ans = String.valueOf(result);
		} catch(Exception e){
			ans = "入力された値が正しくありません。整数を入力してください";
		}

		return ans;
	}


	/**
	 * 文字列を数値に変換する
	 *
	 * @param val 文字列
	 * @return 数値
	 */
	private int convertToNumber(String val){

		// 値が空の場合はゼロを返却
		if(StringUtils.isEmpty(val)){
			return 0;
		}

		// 数値に変換した値を返却
		return Integer.parseInt(val);
	}
}
