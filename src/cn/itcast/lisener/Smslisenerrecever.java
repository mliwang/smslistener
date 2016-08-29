package cn.itcast.lisener;

import java.util.Iterator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;

public class Smslisenerrecever extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// �����ŵ���ʱִ��onReceiver
		//��ȡ�����ߺ���ͷ�������
		Object objects[]= (Object[]) intent.getExtras().get("pdus");
		for(Object obj:objects){
			//��ȡsmsmessageʵ��
			SmsMessage smsMessage = SmsMessage.createFromPdu((byte[])obj);
			String messageBody = smsMessage.getMessageBody();
			String address = smsMessage.getOriginatingAddress();
			System.out.println("body:"+messageBody+"--------����"+address);
			
		}
		

	}

}
