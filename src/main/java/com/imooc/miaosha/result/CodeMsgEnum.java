package com.imooc.miaosha.result;

public enum CodeMsgEnum {
	//通用异常
	SUCCESS(0, "success"),
	SERVER_ERROR(500100, "服务端异常");
	//登录模块 5002XX

	//商品模块 5003XX

	//订单模块 5004XX

	//秒杀模块 5005XX

	private int code;
	private String msg;

	
	CodeMsgEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}

	public static CodeMsgEnum codeOf(int code)
	{
		for (CodeMsgEnum codeMsgEnum : values())
		{
			if (codeMsgEnum.getCode()==code)
			{
				return codeMsgEnum;
			}
		}
		return null;
	}
}
