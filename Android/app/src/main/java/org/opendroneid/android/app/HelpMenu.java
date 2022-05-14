package org.opendroneid.android.app;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import org.opendroneid.android.R;

public class HelpMenu extends DialogFragment {

    static HelpMenu newInstance() { return new HelpMenu(); }

    @Override @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.help_text, container, true);

        TextView helpView = view.findViewById(R.id.bluetoothHelpText);
        String linkText =
                "対象となるすべての機器がBluetooth 4 Legacy AdvertisingのリモートID信号を受信できる状態が必要となります。<br><br>" +
                "Bluetooth 5 Long RangeのリモートID信号を受信するためには、機器が \"Coded Phy\" 機能および \"Extended Advertising\" 機能に対応している必要があります。<br><br>" +
                "オプションメニューのこれらの機能については、このデバイスに関するサポート仕様をご参照ください。<br><br>" +
                "なお、これらの機能をサポートしても、必ずしもLong Range電波を拾えるわけではなく、あるいは限られた時間間隔でしか拾えないことをご了承ください。<br>";
        helpView.setText(Html.fromHtml(linkText, Html.FROM_HTML_MODE_LEGACY));

        helpView = view.findViewById(R.id.beaconHelpText);
        linkText =
                "Android 6 (Marshmallow) 以降を搭載する対象となるすべての端末にて、Wi-Fi BeaconのリモートID信号を受信できる状況が必要となります。<br><br>" +
                "受信レートは、ハードウェアやソフトウェアによって、機器毎に大きく異なる場合があります。<br><br>" +
                "Wi-Fi Beacon リモートID信号の受信率は、Wi-Fi スキャン <a href='https://developer.android.com/guide/topics/connectivity/wifi-scan#wifi-scan-throttling'>スロットリング</a> を無効にすることにより、ある程度改善することが可能です。<br><br>" +
                "【システム】を開いて<a href='https://developer.android.com/studio/debug/dev-options'>【開発者向けオプション】</a>を有効にしてください。<br><br>" +
                "ソフトウェアの詳細情報を見つけ (多分 \"デバイス情報\" メニューの) \"ビルド番号\" を7回クリックしてください。<br><br>" +
                "もう一度戻り【システム＞＞開発者オプション】メニューを見つけ【Wi-Fi スキャン スロットリング】までスクロールして、これを無効にします。<br>";
        helpView.setText(Html.fromHtml(linkText, Html.FROM_HTML_MODE_LEGACY));
        helpView.setMovementMethod(LinkMovementMethod.getInstance());

        helpView = view.findViewById(R.id.nanHelpText);
        linkText =
                "Wi-Fi Neighbor-aware Network リモートID信号の受信は、Wi-Fi NaNをサポートしている端末のみ可能です。<br><br>" +
                "オプションメニューのこれらの機能については、このデバイスに関するサポート仕様をご参照ください。<br><br>";
        helpView.setText(Html.fromHtml(linkText, Html.FROM_HTML_MODE_LEGACY));
        return view;
    }
}
