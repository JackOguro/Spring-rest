package com.example.rest;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestResult {

	/* リターンコード */
	// リターンコードには正常終了したか、バリデーションに引っかかったかどうかのコードを入れる
	private int result;
	
	/** エラーマップ
	 * key: フィールド名
	 * value: エラーメッセージ
	 */
	// errorsフィールドにはバリデーション結果がNGとなったフィールド名とエラーメッセージを入れる
	private Map<String, String> errors;
}
