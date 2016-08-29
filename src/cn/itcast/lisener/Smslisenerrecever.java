package cn.itcast.lisener;

import java.util.Iterator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;

public class Smslisenerrecever extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// 当短信到来时执行onReceiver
		//获取发送者号码和发送内容
		Object objects[]= (Object[]) intent.getExtras().get("pdus");
		for(Object obj:objects){
			//获取smsmessage实例
			SmsMessage smsMessage = SmsMessage.createFromPdu((byte[])obj);
			String messageBody = smsMessage.getMessageBody();
			String address = smsMessage.getOriginatingAddress();
			System.out.println("body:"+messageBody+"--------号码"+address);
			
		}
		

	}

}
