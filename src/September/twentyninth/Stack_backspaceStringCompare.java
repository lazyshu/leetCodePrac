//package September.twentyninth;
//
//public class Stack_backspaceStringCompare {
//    public static void main(String[] args) {
//        String s = "ab#c", t = "ad#c";
//
//         int length = s.length();
//         byte[] sInByteArray = new byte[length];
//         s.getBytes(0, length, sInByteArray, 0);
//
//         int length2 = t.length();
//         byte[] tInByteArray = new byte[length2];
//         t.getBytes(0, length2, tInByteArray, 0);
//
//         int sharp=0;int sharp2=0;
//         for (int i = 0; i < length; i++) {
//             if (sInByteArray[i] == '#') {
//                 sharp++;
//             } else {
//                 sInByteArray[i - sharp * 2] = sInByteArray[i];
//             }
//
//        // }
//        // for (int i = 0; i < length2; i++) {
//
//        //     if (tInByteArray[i] == '#') {
//        //         sharp2++;
//        //     } else {
//        //         tInByteArray[i - sharp2 * 2] = tInByteArray[i];
//        //     }
//        // }
//        // if (new String(sInByteArray, 0, length - sharp * 2).equals(new String(tInByteArray, 0, length2 - sharp2 * 2))) {
//        //     return true;
//        // }return false;
//    }
//}
