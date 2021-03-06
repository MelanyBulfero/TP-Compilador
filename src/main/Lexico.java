// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: Lexico.flex

package main;

import java_cup.runtime.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\2\22\0\1\1"+
    "\1\0\1\5\3\0\1\6\1\0\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\12\17\1\20\1\0"+
    "\1\21\1\22\1\23\2\0\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\2\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\35\1\43\1\44\1\45\1\35"+
    "\1\46\1\47\3\35\1\50\1\0\1\51\1\0\1\52"+
    "\1\0\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
    "\1\62\1\63\2\35\1\64\1\65\1\66\1\67\1\70"+
    "\1\35\1\71\1\72\1\73\1\35\1\74\1\75\3\35"+
    "\1\76\1\77\1\100\7\0\1\3\53\0\1\35\21\0"+
    "\1\35\u0154\0\1\35\17\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\1\12\1\1\1\13\1\14"+
    "\1\15\13\16\1\17\1\20\10\16\1\21\1\1\1\22"+
    "\1\0\1\23\1\24\1\25\1\0\1\26\1\0\1\27"+
    "\1\30\1\14\1\31\10\16\1\32\1\16\1\33\12\16"+
    "\1\33\3\0\1\24\1\34\6\16\1\35\10\16\1\36"+
    "\1\0\2\16\1\37\1\0\10\16\1\0\4\16\5\0"+
    "\1\36\2\16\1\0\2\16\1\40\1\41\1\16\1\42"+
    "\2\16\1\0\2\16\1\0\1\36\4\0\2\16\1\0"+
    "\2\16\1\43\1\0\2\16\1\0\2\16\2\0\1\36"+
    "\2\0\1\16\1\44\1\0\2\16\1\0\1\16\1\0"+
    "\2\16\1\36\3\0\1\16\1\0\2\16\1\0\1\16"+
    "\1\0\2\16\1\0\1\16\1\0\2\16\1\0\1\16"+
    "\1\0\2\16\1\0\1\16\1\0\1\16\1\45\1\0"+
    "\1\16\1\0\1\16\1\0\1\16\2\46\1\0\1\16"+
    "\1\0\1\16\1\0\1\16\2\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[211];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\101\0\202\0\303\0\u0104\0\101\0\101\0\101"+
    "\0\101\0\101\0\u0145\0\u0186\0\101\0\u01c7\0\u0208\0\u0249"+
    "\0\u028a\0\u02cb\0\u030c\0\u034d\0\u038e\0\u03cf\0\u0410\0\u0451"+
    "\0\u0492\0\u04d3\0\u0514\0\u0555\0\u0596\0\101\0\101\0\u05d7"+
    "\0\u0618\0\u0659\0\u069a\0\u06db\0\u071c\0\u075d\0\u079e\0\101"+
    "\0\u07df\0\101\0\303\0\101\0\101\0\u0186\0\u0820\0\101"+
    "\0\u0861\0\101\0\101\0\101\0\101\0\u08a2\0\u08e3\0\u0924"+
    "\0\u0965\0\u09a6\0\u09e7\0\u0a28\0\u0a69\0\u038e\0\u0aaa\0\u038e"+
    "\0\u0aeb\0\u0b2c\0\u0b6d\0\u0bae\0\u0bef\0\u0c30\0\u0c71\0\u0cb2"+
    "\0\u0cf3\0\u0d34\0\101\0\u0d75\0\u0db6\0\u0df7\0\u038e\0\u038e"+
    "\0\u0e38\0\u0e79\0\u0eba\0\u0efb\0\u0f3c\0\u0f7d\0\u038e\0\u0fbe"+
    "\0\u0fff\0\u1040\0\u1081\0\u10c2\0\u1103\0\u1144\0\u1185\0\u11c6"+
    "\0\u1207\0\u1248\0\u1289\0\u038e\0\u12ca\0\u130b\0\u134c\0\u138d"+
    "\0\u13ce\0\u140f\0\u1450\0\u1491\0\u14d2\0\u1513\0\u1554\0\u1595"+
    "\0\u15d6\0\u1617\0\u11c6\0\u1658\0\u1699\0\u16da\0\u171b\0\u175c"+
    "\0\u179d\0\u17de\0\u181f\0\u1860\0\u18a1\0\u038e\0\u038e\0\u18e2"+
    "\0\u038e\0\u1923\0\u1964\0\u19a5\0\u19e6\0\u1a27\0\u175c\0\u1a68"+
    "\0\u1aa9\0\u1aea\0\u1b2b\0\u1b6c\0\u1bad\0\u1bee\0\u1c2f\0\u1c70"+
    "\0\u1cb1\0\u038e\0\u1cf2\0\u1d33\0\u1d74\0\u1db5\0\u1df6\0\u1e37"+
    "\0\u1a68\0\u1e78\0\u1eb9\0\u1efa\0\u1f3b\0\u1f7c\0\u038e\0\u1fbd"+
    "\0\u1ffe\0\u203f\0\u2080\0\u20c1\0\u2102\0\u2143\0\u2184\0\101"+
    "\0\u1eb9\0\u21c5\0\u2206\0\u2247\0\u2288\0\u22c9\0\u230a\0\u234b"+
    "\0\u238c\0\u23cd\0\u240e\0\u244f\0\u2490\0\u24d1\0\u2512\0\u2553"+
    "\0\u2594\0\u25d5\0\u2616\0\u2657\0\u2698\0\u26d9\0\u271a\0\u275b"+
    "\0\u279c\0\u27dd\0\u038e\0\u281e\0\u285f\0\u28a0\0\u28e1\0\u2922"+
    "\0\u2963\0\101\0\u038e\0\u29a4\0\u29e5\0\u2a26\0\u2a67\0\u2aa8"+
    "\0\u2ae9\0\101\0\u038e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[211];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\2\25\1\31\4\25\1\32\1\33\1\25\1\34"+
    "\2\25\1\35\1\36\1\37\1\2\1\40\1\41\1\25"+
    "\1\42\1\43\3\25\1\44\3\25\1\45\1\46\4\25"+
    "\1\47\1\50\1\51\1\52\102\0\2\3\1\0\1\3"+
    "\74\0\2\53\1\0\2\53\1\54\73\53\6\0\1\55"+
    "\111\0\1\16\100\0\1\56\75\0\1\57\1\56\1\0"+
    "\1\16\103\0\1\60\74\0\1\61\3\0\1\62\1\63"+
    "\77\0\1\64\100\0\1\65\75\0\1\25\4\0\14\25"+
    "\1\66\5\25\1\67\1\25\2\0\24\25\22\0\1\25"+
    "\4\0\4\25\1\70\17\25\2\0\24\25\22\0\1\25"+
    "\4\0\24\25\2\0\24\25\22\0\1\25\4\0\4\25"+
    "\1\71\17\25\2\0\24\25\22\0\1\25\4\0\12\25"+
    "\1\72\1\25\1\73\7\25\2\0\12\25\1\74\11\25"+
    "\22\0\1\25\4\0\12\25\1\75\11\25\2\0\24\25"+
    "\22\0\1\25\4\0\5\25\1\76\6\25\1\77\7\25"+
    "\2\0\6\25\1\76\15\25\22\0\1\25\4\0\17\25"+
    "\1\100\4\25\2\0\24\25\22\0\1\25\4\0\17\25"+
    "\1\101\4\25\2\0\24\25\22\0\1\25\4\0\21\25"+
    "\1\102\2\25\2\0\24\25\22\0\1\25\4\0\7\25"+
    "\1\103\14\25\2\0\24\25\22\0\1\25\4\0\24\25"+
    "\2\0\14\25\1\104\5\25\1\105\1\25\22\0\1\25"+
    "\4\0\24\25\2\0\5\25\1\106\16\25\22\0\1\25"+
    "\4\0\24\25\2\0\5\25\1\107\16\25\22\0\1\25"+
    "\4\0\24\25\2\0\12\25\1\74\1\25\1\110\7\25"+
    "\22\0\1\25\4\0\24\25\2\0\6\25\1\76\15\25"+
    "\22\0\1\25\4\0\24\25\2\0\17\25\1\100\4\25"+
    "\22\0\1\25\4\0\24\25\2\0\17\25\1\111\4\25"+
    "\22\0\1\25\4\0\24\25\2\0\10\25\1\112\13\25"+
    "\102\0\1\113\20\0\1\114\61\0\16\61\1\115\2\61"+
    "\1\116\57\61\17\0\1\25\4\0\3\25\1\117\20\25"+
    "\2\0\24\25\22\0\1\25\4\0\6\25\1\120\15\25"+
    "\2\0\24\25\22\0\1\25\4\0\6\25\1\121\15\25"+
    "\2\0\24\25\22\0\1\25\4\0\2\25\1\122\21\25"+
    "\2\0\24\25\22\0\1\25\4\0\20\25\1\123\3\25"+
    "\2\0\24\25\22\0\1\25\4\0\3\25\1\124\20\25"+
    "\2\0\24\25\22\0\1\25\4\0\24\25\2\0\20\25"+
    "\1\125\3\25\22\0\1\25\4\0\15\25\1\126\6\25"+
    "\2\0\24\25\22\0\1\25\4\0\21\25\1\127\2\25"+
    "\2\0\24\25\22\0\1\25\4\0\10\25\1\130\13\25"+
    "\2\0\24\25\22\0\1\25\4\0\17\25\1\131\4\25"+
    "\2\0\24\25\22\0\1\25\4\0\10\25\1\132\13\25"+
    "\2\0\24\25\22\0\1\25\4\0\24\25\2\0\4\25"+
    "\1\117\17\25\22\0\1\25\4\0\24\25\2\0\7\25"+
    "\1\120\14\25\22\0\1\25\4\0\24\25\2\0\7\25"+
    "\1\133\14\25\22\0\1\25\4\0\24\25\2\0\3\25"+
    "\1\134\20\25\22\0\1\25\4\0\24\25\2\0\4\25"+
    "\1\135\17\25\22\0\1\25\4\0\24\25\2\0\11\25"+
    "\1\136\12\25\22\0\1\25\4\0\24\25\2\0\11\25"+
    "\1\137\12\25\17\0\1\57\1\56\1\0\1\114\61\0"+
    "\16\61\1\115\2\61\1\116\1\61\1\140\73\61\1\141"+
    "\2\61\1\116\57\61\17\0\1\25\4\0\10\25\1\142"+
    "\13\25\2\0\24\25\22\0\1\25\4\0\12\25\1\143"+
    "\11\25\2\0\24\25\22\0\1\25\4\0\4\25\1\144"+
    "\17\25\2\0\24\25\3\0\2\145\3\0\12\145\1\146"+
    "\4\145\3\146\1\147\20\146\2\145\24\146\3\145\17\0"+
    "\1\25\4\0\24\25\2\0\5\25\1\144\16\25\22\0"+
    "\1\25\4\0\1\150\23\25\2\0\24\25\22\0\1\25"+
    "\4\0\14\25\1\151\7\25\2\0\24\25\22\0\1\25"+
    "\4\0\10\25\1\152\13\25\2\0\24\25\22\0\1\25"+
    "\4\0\12\25\1\153\11\25\2\0\24\25\22\0\1\25"+
    "\4\0\24\25\2\0\11\25\1\154\12\25\22\0\1\25"+
    "\4\0\24\25\2\0\12\25\1\155\11\25\3\0\2\156"+
    "\3\0\12\156\1\157\4\156\24\157\2\156\4\157\1\160"+
    "\17\157\3\156\17\0\1\25\4\0\24\25\2\0\14\25"+
    "\1\161\7\25\22\0\1\25\4\0\24\25\2\0\12\25"+
    "\1\162\11\25\3\0\21\163\1\164\57\163\16\165\1\166"+
    "\2\165\1\167\1\165\1\170\55\165\17\0\1\25\4\0"+
    "\14\25\1\171\7\25\2\0\24\25\22\0\1\25\4\0"+
    "\1\172\23\25\2\0\24\25\45\0\1\173\55\0\1\25"+
    "\4\0\16\25\1\174\5\25\2\0\24\25\22\0\1\25"+
    "\4\0\4\25\1\175\11\25\1\174\5\25\2\0\24\25"+
    "\22\0\1\25\4\0\21\25\1\176\2\25\2\0\24\25"+
    "\22\0\1\25\4\0\21\25\1\177\2\25\2\0\24\25"+
    "\22\0\1\25\4\0\14\25\1\200\7\25\2\0\24\25"+
    "\22\0\1\25\4\0\4\25\1\201\17\25\2\0\24\25"+
    "\22\0\1\25\4\0\24\25\2\0\14\25\1\202\7\25"+
    "\22\0\1\25\4\0\24\25\2\0\1\25\1\203\22\25"+
    "\73\0\1\204\27\0\1\25\4\0\24\25\2\0\16\25"+
    "\1\205\5\25\22\0\1\25\4\0\24\25\2\0\5\25"+
    "\1\206\10\25\1\205\5\25\22\0\1\25\4\0\24\25"+
    "\2\0\21\25\1\177\2\25\22\0\1\25\4\0\24\25"+
    "\2\0\5\25\1\201\16\25\3\0\16\163\1\207\2\163"+
    "\1\164\57\163\16\165\1\166\2\165\1\167\75\165\1\166"+
    "\2\165\1\167\1\165\1\210\73\165\1\211\2\165\1\167"+
    "\57\165\16\207\1\212\2\207\1\213\57\207\2\214\3\0"+
    "\12\214\1\215\4\214\24\215\2\214\24\215\3\214\17\0"+
    "\1\25\4\0\17\25\1\216\4\25\2\0\24\25\46\0"+
    "\1\217\54\0\1\25\4\0\17\25\1\220\4\25\2\0"+
    "\24\25\22\0\1\25\4\0\2\25\1\221\21\25\2\0"+
    "\24\25\22\0\1\25\4\0\6\25\1\222\15\25\2\0"+
    "\24\25\3\0\2\223\3\0\12\223\1\224\4\223\24\224"+
    "\2\223\24\224\3\223\17\0\1\25\4\0\24\25\2\0"+
    "\17\25\1\225\4\25\74\0\1\226\26\0\1\25\4\0"+
    "\24\25\2\0\17\25\1\227\4\25\22\0\1\25\4\0"+
    "\24\25\2\0\3\25\1\230\20\25\3\0\16\231\1\232"+
    "\62\231\16\165\1\166\2\165\1\167\1\165\1\233\55\165"+
    "\16\207\1\212\2\207\1\213\1\207\1\231\73\207\1\234"+
    "\2\207\1\213\57\207\42\0\1\235\55\0\1\25\4\0"+
    "\16\25\1\236\5\25\2\0\24\25\22\0\1\25\4\0"+
    "\4\25\1\237\17\25\2\0\24\25\44\0\1\240\56\0"+
    "\1\25\4\0\15\25\1\241\6\25\2\0\24\25\22\0"+
    "\1\25\4\0\12\25\1\242\11\25\2\0\24\25\73\0"+
    "\1\243\27\0\1\25\4\0\24\25\2\0\16\25\1\244"+
    "\5\25\22\0\1\25\4\0\24\25\2\0\5\25\1\237"+
    "\16\25\72\0\1\245\30\0\1\25\4\0\24\25\2\0"+
    "\15\25\1\246\6\25\22\0\1\25\4\0\24\25\2\0"+
    "\12\25\1\247\11\25\3\0\16\231\1\232\4\231\1\250"+
    "\55\231\16\251\1\252\62\251\16\207\1\212\2\207\1\213"+
    "\1\207\1\251\55\207\43\0\1\253\54\0\1\25\4\0"+
    "\17\25\1\254\4\25\2\0\24\25\35\0\1\255\65\0"+
    "\1\25\4\0\6\25\1\256\15\25\2\0\24\25\22\0"+
    "\1\25\4\0\1\257\23\25\2\0\24\25\74\0\1\260"+
    "\26\0\1\25\4\0\24\25\2\0\17\25\1\261\4\25"+
    "\64\0\1\262\36\0\1\25\4\0\24\25\2\0\7\25"+
    "\1\263\14\25\22\0\1\25\4\0\24\25\2\0\1\25"+
    "\1\264\22\25\3\0\16\251\1\252\4\251\1\210\55\251"+
    "\41\0\1\265\56\0\1\25\4\0\15\25\1\266\6\25"+
    "\2\0\24\25\46\0\1\267\54\0\1\25\4\0\17\25"+
    "\1\270\4\25\2\0\24\25\22\0\1\25\4\0\17\25"+
    "\1\271\4\25\2\0\24\25\72\0\1\272\30\0\1\25"+
    "\4\0\24\25\2\0\15\25\1\273\6\25\74\0\1\274"+
    "\26\0\1\25\4\0\24\25\2\0\17\25\1\275\4\25"+
    "\22\0\1\25\4\0\24\25\2\0\17\25\1\276\4\25"+
    "\35\0\1\277\65\0\1\25\4\0\6\25\1\300\15\25"+
    "\2\0\24\25\27\0\1\301\73\0\1\25\4\0\1\302"+
    "\23\25\2\0\24\25\22\0\1\25\4\0\4\25\1\303"+
    "\17\25\2\0\24\25\64\0\1\304\36\0\1\25\4\0"+
    "\24\25\2\0\7\25\1\305\14\25\56\0\1\306\44\0"+
    "\1\25\4\0\24\25\2\0\1\25\1\307\22\25\22\0"+
    "\1\25\4\0\24\25\2\0\5\25\1\303\16\25\46\0"+
    "\1\310\54\0\1\25\4\0\17\25\1\311\4\25\2\0"+
    "\24\25\42\0\1\312\60\0\1\25\4\0\13\25\1\313"+
    "\10\25\2\0\24\25\74\0\1\314\26\0\1\25\4\0"+
    "\24\25\2\0\17\25\1\315\4\25\70\0\1\312\32\0"+
    "\1\25\4\0\24\25\2\0\13\25\1\313\10\25\27\0"+
    "\1\316\73\0\1\25\4\0\1\317\23\25\2\0\24\25"+
    "\56\0\1\320\44\0\1\25\4\0\24\25\2\0\1\25"+
    "\1\321\22\25\42\0\1\322\60\0\1\25\4\0\13\25"+
    "\1\323\10\25\2\0\24\25\70\0\1\322\32\0\1\25"+
    "\4\0\24\25\2\0\13\25\1\323\10\25\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11050];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\5\11\2\1\1\11\20\1\2\11"+
    "\10\1\1\11\1\1\1\11\1\0\2\11\1\1\1\0"+
    "\1\11\1\0\4\11\25\1\1\11\3\0\22\1\1\0"+
    "\3\1\1\0\10\1\1\0\4\1\5\0\3\1\1\0"+
    "\10\1\1\0\2\1\1\0\1\1\4\0\2\1\1\0"+
    "\3\1\1\0\2\1\1\0\2\1\2\0\1\1\2\0"+
    "\2\1\1\0\2\1\1\0\1\1\1\0\2\1\1\11"+
    "\3\0\1\1\1\0\2\1\1\0\1\1\1\0\2\1"+
    "\1\0\1\1\1\0\2\1\1\0\1\1\1\0\2\1"+
    "\1\0\1\1\1\0\2\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\11\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[211];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
	
	public String s = "";
	public String Error = "";
	final int MAX_STRING = 30;
	final int MAX_INT = Short.MAX_VALUE;
	final float MAX_FLOAT = Float.MAX_VALUE;

	private boolean verify_real(String x) throws Exception {
		float f = Float.parseFloat(x);
		if (f < -MAX_FLOAT || f > MAX_FLOAT) {
			Error="La longitud del lexema "+x+" excede la esperada";
			throw new Exception("La longitud del lexema "+x+" excede la esperada");
		}
		return true;
	}

	private boolean verify_int(String x) throws Exception {
		try {
			int i = Integer.parseInt(x);
			if (i < -MAX_INT || i > MAX_INT) {
				Error="La longitud del lexema "+x+" excede la esperada";
				throw new Exception("La longitud del lexema "+x+" excede la esperada");
			}
		}catch (NumberFormatException e) {
			Error="La longitud del lexema "+x+" excede la esperada";
			throw new Exception("La longitud del lexema "+x+" excede la esperada");
		}
		return true;
	}

	private boolean verify_string(String x) throws Exception {
		if (x.length() > MAX_STRING) {
			Error="La longitud del lexema "+x+" excede la esperada";
			throw new Exception("La longitud del lexema "+x+" excede la esperada");
		}
		return true;
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
  
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol(sym.EOF);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { Error="Caracter no permitido: <" + yytext() + "> en la linea " + yyline;
			throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline);
            }
            // fall through
          case 40: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 41: break;
          case 3:
            { s=s+"Token ParA encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.ParA,yytext());
            }
            // fall through
          case 42: break;
          case 4:
            { s=s+"Token ParC encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.ParC,yytext());
            }
            // fall through
          case 43: break;
          case 5:
            { s=s+"Token Multiplicacion encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Multiplicacion,yytext());
            }
            // fall through
          case 44: break;
          case 6:
            { s=s+"Token Suma encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Suma,yytext());
            }
            // fall through
          case 45: break;
          case 7:
            { s=s+"Token Coma encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Coma,yytext());
            }
            // fall through
          case 46: break;
          case 8:
            { s=s+"Token Resta encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Resta,yytext());
            }
            // fall through
          case 47: break;
          case 9:
            { s=s+"Token Division encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Division,yytext());
            }
            // fall through
          case 48: break;
          case 10:
            { try {
                            verify_int(yytext());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
							s=s+"Token Numero encontrado, Lexema "+ yytext()+"\n";
							//writeSymbolTable("_"+ yytext() + ",Numero,,"+ yytext()+ ",");
							return new Symbol(sym.Numero,yytext());
            }
            // fall through
          case 49: break;
          case 11:
            { s=s+"Token Menor encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Menor,yytext());
            }
            // fall through
          case 50: break;
          case 12:
            { s=s+"Token Igual encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Igual,yytext());
            }
            // fall through
          case 51: break;
          case 13:
            { s=s+"Token Mayor encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Mayor,yytext());
            }
            // fall through
          case 52: break;
          case 14:
            { s=s+"Token VarId encontrado, Lexema "+ yytext()+"\n";
						//writeSymbolTable(yytext() + ",VarId,,"+",");
						return new Symbol(sym.VarId,yytext());
            }
            // fall through
          case 53: break;
          case 15:
            { s=s+"Token CorcheteA encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.CorcheteA,yytext());
            }
            // fall through
          case 54: break;
          case 16:
            { s=s+"Token CorcheteC encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.CorcheteC,yytext());
            }
            // fall through
          case 55: break;
          case 17:
            { s=s+"Token LlaveA encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.LlaveA,yytext());
            }
            // fall through
          case 56: break;
          case 18:
            { s=s+"Token LlaveC encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.LlaveC,yytext());
            }
            // fall through
          case 57: break;
          case 19:
            { try {
                            verify_string(yytext());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
							s=s+"Token Const_String encontrado, Lexema "+ yytext()+"\n";
							//writeSymbolTable("_"+ yytext() + ",Const_String,,"+ yytext()+ ","+ yytext().length());
							return new Symbol(sym.Const_String,yytext());
            }
            // fall through
          case 58: break;
          case 20:
            { s=s+"Token And encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.And,yytext());
            }
            // fall through
          case 59: break;
          case 21:
            { try {
                            verify_real(yytext());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
							s=s+"Token Real encontrado, Lexema "+ yytext()+"\n";
							//writeSymbolTable("_"+ yytext() + ",Real,,"+ yytext()+ ",");
							return new Symbol(sym.Real,yytext());
            }
            // fall through
          case 60: break;
          case 22:
            { s=s+"Token Asignacion encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Asignacion,yytext());
            }
            // fall through
          case 61: break;
          case 23:
            { s=s+"Token MenorI encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.MenorI,yytext());
            }
            // fall through
          case 62: break;
          case 24:
            { s=s+"Token Distinto encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Distinto,yytext());
            }
            // fall through
          case 63: break;
          case 25:
            { s=s+"Token MayorI encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.MayorI,yytext());
            }
            // fall through
          case 64: break;
          case 26:
            { s=s+"Token If encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.If,yytext());
            }
            // fall through
          case 65: break;
          case 27:
            { s=s+"Token Or encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Or,yytext());
            }
            // fall through
          case 66: break;
          case 28:
            { s=s+"Token Avg encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Avg,yytext());
            }
            // fall through
          case 67: break;
          case 29:
            { s=s+"Token PInt encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.PInt,yytext());
            }
            // fall through
          case 68: break;
          case 30:
            { /**/
            }
            // fall through
          case 69: break;
          case 31:
            { s=s+"Token Else encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Else,yytext());
            }
            // fall through
          case 70: break;
          case 32:
            { s=s+"Token PFloat encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.PFloat,yytext());
            }
            // fall through
          case 71: break;
          case 33:
            { s=s+"Token Print encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.Print,yytext());
            }
            // fall through
          case 72: break;
          case 34:
            { s=s+"Token While encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.While,yytext());
            }
            // fall through
          case 73: break;
          case 35:
            { s=s+"Token PString encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.PString,yytext());
            }
            // fall through
          case 74: break;
          case 36:
            { s=s+"Token DeclareB encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.DeclareB,yytext());
            }
            // fall through
          case 75: break;
          case 37:
            { s=s+"Token DeclareE encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.DeclareE,yytext());
            }
            // fall through
          case 76: break;
          case 38:
            { s=s+"Token ProgramE encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.ProgramE,yytext());
            }
            // fall through
          case 77: break;
          case 39:
            { s=s+"Token ProgramB encontrado, Lexema "+ yytext()+"\n";
						return new Symbol(sym.ProgramB,yytext());
            }
            // fall through
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
