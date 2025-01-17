# 送信機デバイスについて

このページでは、ASD-STAN prEN4709-02 (EU版) 、ASTM F3411 (US版) 規格に準拠したダイレクトリモートID信号をブロードキャストできる送信機の一覧を掲載しています。

リモートIDの詳細や追加資料へのリンクは [opendroneid-core-c project](https://github.com/opendroneid/opendroneid-core-c#opendroneid-core-c) をご覧ください。

リモートID信号の受信が確認されているスマートフォンの [一覧](supported-smartphones.md) や、各種オープンソースの受信機実装に関する情報は [こちら](https://github.com/opendroneid/opendroneid-core-c#receiver-examples) に公開されています。

この一覧は作業中であり、間違ったデータや誤解を招くようなデータが含まれている可能性があります。
データの追加、削除、修正などが必要な場合は、issueを投稿するか、変更を加えたプルリクエストを提供してください。

このページの意図としては、特定の商用または非商用の機器や実装を促進または排除することではありません。
単にリモートIDに興味を持つ人のための情報源として位置づけています。
この一覧にない機器について情報をお持ちの方は、ぜひご指摘・更新をお願いします。

一覧は、ドローン、アドオンデバイス、その他の実装の3つのセクションに分かれています。

## ドローンについて

米国とEUのルールでは、ドローンがリモートID信号をブロードキャストすることはまだ義務付けられていません。
タイムラインについては、いくつかの情報が [こちら](https://github.com/opendroneid/opendroneid-core-c#timelines) に掲載されています。

この一覧は、締切日が近づくにつれ、増加していくことが予想されます。

リストはアルファベット順で表示されます。


| デバイス      | BT 4 | BT 5 | Wi-Fi Beacon | Wi-Fi NAN | リンク                                 | 備考                         |
| ------------- | ---- | ---- | ------------ | --------- | -------------------------------------- | ---------------------------- |
| Parrot Anafi  | ❌   | ❌   | ✅            | ❌        | https://www.parrot.com/en/drones/anafi | FWバージョン >= 1.8.0 が必要 |

## アドオンデバイス

アドオンデバイスは、既存のドローンに後付けすることを目的としたリモートIDのスタンドアロン実装で、ドローン本体のハードウェア/ソフトウェアを変更することが現実的ではない/可能でない場合に使用します。

一覧はアルファベット順で表示されます。


| デバイス      | BT 4 | BT 5 | Wi-Fi Beacon | Wi-Fi NAN | リンク                                              |
| ------------- | ---- | ---- | ------------ | --------- | --------------------------------------------------- |
| Aerobits idME | ✅   | ✅   | ❌            | ❌        | https://www.aerobits.pl/product/idme/               |
| DroneTag Mini | ✅   | ✅   | ❌            | ❌        | https://dronetag.cz/en/products/mini/               |
| INVOLI LEMAN  | ❌   | ❌   |              | ✅         | https://www.involi.com/products/leman-drone-tracker |

## その他の送信機の実装

オープンソース送信機の実装例については [こちら](https://github.com/opendroneid/opendroneid-core-c#transmitter-examples) をご覧ください。
