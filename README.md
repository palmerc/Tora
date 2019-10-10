## AIPhone GT-series NFC brute force tool

![Aiphone GT-DMB-N](https://www.aiphone.com/wp-content/uploads/GT-DMB-N-Main.jpg)

The [Aiphone GT-series DMB-N front door callbox](https://www.aiphone.com/home/products/gt-dmb-n) has two passcodes by default (found in the setup manual). If you're lucky the contractor forgot to change them.

  * Admin *1111
  * Manager #2222

The communication over NFC feels like a wireless version of what they must have sent over a serial cable before they added this convenient NFC reader. When you download the config, you get _all_ of the information, including all passcodes. This information is easily retrieved with an Android phone once you have found either the Admin or Manager code. You can retrieve the other passcode by downloading the offical `Aiphone GT Setup Tool for Android` downloading the config and inspecting the configuration text file that was downloaded. It's just that stupid.

This tool will brute force the passcode in about 5 minutes by trying each code rapidly in succession. This is possible because the firmware doesn't throttle your successive failed attempts or reset the connection.

To my knowledge there are no field firmware upgrades to these devices, so this hack is permanent.

### Side notes

I have also instrumented the `Aiphone GT Setup Tool for Android` app and log the entire session so I can see how the system uses the commands. I might publish a how-to when I have some time. I did provide a `LogTool.java` that I used in the extras folder. 

Break down the entire `Aiphone GT Setup Tool for Android` apk into Smali. Then add LogTool.java (compiled to Smali) to the files. I then instrumented interesting parts of the program like the function `processCommandApdu` in `GTHostApduService.java` and logged the incoming byte array to a file. Once you have that in place you can reconstitute the apk and load it on a phone. 

The Windows config tool from Aiphone is a .net app and is a great resource for knowing what all of the serial commands do in English and Japanese. I think at the time I was using [dotPeek](https://www.jetbrains.com/decompiler/) to reverse that.

