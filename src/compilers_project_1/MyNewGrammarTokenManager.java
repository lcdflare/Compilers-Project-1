/* Generated By:JavaCC: Do not edit this line. MyNewGrammarTokenManager.java */
package compilers_project_1;

/** Token Manager. */
public class MyNewGrammarTokenManager implements MyNewGrammarConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1fff7e0000000L) != 0L)
         {
            jjmatchedKind = 49;
            return 1;
         }
         if ((active0 & 0x30000L) != 0L)
            return 1;
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 49;
            return 11;
         }
         return -1;
      case 1:
         if ((active0 & 0x1000000000L) != 0L)
            return 1;
         if ((active0 & 0x1ffefe0000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x3c800000000L) != 0L)
            return 1;
         if ((active0 & 0x1fc27e0000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 49;
               jjmatchedPos = 2;
            }
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x840200000000L) != 0L)
            return 1;
         if ((active0 & 0x17aa5e0000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x10000c0000000L) != 0L)
            return 1;
         if ((active0 & 0x7aa520000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0xaa420000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x700100000000L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x2a000000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x80420000000L) != 0L)
            return 1;
         return -1;
      case 7:
         if ((active0 & 0xa000000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 7;
            return 1;
         }
         if ((active0 & 0x20000000000L) != 0L)
            return 1;
         return -1;
      case 8:
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 8;
            return 1;
         }
         if ((active0 & 0x8000000000L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 37:
         return jjStopAtPos(0, 9);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 40:
         return jjStopAtPos(0, 14);
      case 41:
         return jjStopAtPos(0, 15);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 44:
         return jjStopAtPos(0, 12);
      case 45:
         return jjStopAtPos(0, 6);
      case 46:
         return jjStopAtPos(0, 13);
      case 47:
         return jjStopAtPos(0, 8);
      case 59:
         return jjStopAtPos(0, 11);
      case 60:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 61:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 62:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 91:
         return jjStartNfaWithStates_0(0, 16, 1);
      case 93:
         return jjStartNfaWithStates_0(0, 17, 1);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x60000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x600000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xf000000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x70000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x300000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 123:
         return jjStopAtPos(0, 18);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 125:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         break;
      case 61:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x330000000000L);
      case 102:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 36, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x280000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x800920000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80040000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 124:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100080000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1880000000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 114:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 116:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x208400000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 119:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20040000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 100:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 47, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 101:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x8400000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 108:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x1002020000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 48, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x2020000000L);
      case 107:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 1);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x100100000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x400400000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x228000000000L);
      case 115:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 101:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 1);
         break;
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 103:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 46, 1);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000L);
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 44, 1);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 45, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x28000000000L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000000L);
      case 110:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(6, 29, 1);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 43, 1);
         break;
      case 115:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(6, 34, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000000L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000000L);
      case 121:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 41, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 39, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 37, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 28;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     jjCheckNAddStates(0, 4);
                  }
                  else if (curChar == 34)
                     jjCheckNAdd(3);
                  if (curChar == 48)
                     jjAddStates(5, 6);
                  break;
               case 11:
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if (curChar == 34)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 34 && kind > 52)
                     kind = 52;
                  break;
               case 13:
                  if (curChar == 48)
                     jjAddStates(5, 6);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAddStates(0, 4);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(19, 20);
                  break;
               case 20:
                  if (curChar != 46)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(21);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(21);
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(22, 23);
                  break;
               case 23:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 26:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(27);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(27);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffffffffffeL & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                     jjCheckNAdd(1);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 11:
                  if ((0x7fffffffffffffeL & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                     jjCheckNAdd(1);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 1:
                  if ((0x7fffffffffffffeL & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x7fffffffffffffeL & l) != 0L)
                     jjAddStates(7, 8);
                  break;
               case 5:
                  if (curChar == 101 && kind > 53)
                     kind = 53;
                  break;
               case 6:
                  if (curChar == 117)
                     jjCheckNAdd(5);
                  break;
               case 7:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 115)
                     jjCheckNAdd(5);
                  break;
               case 10:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 12:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 14:
                  if (curChar == 120)
                     jjCheckNAdd(15);
                  break;
               case 15:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(15);
                  break;
               case 16:
                  if (curChar == 88)
                     jjCheckNAdd(15);
                  break;
               case 25:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 28 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   18, 19, 20, 22, 23, 14, 16, 3, 4, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", "\45", "\75", "\73", 
"\54", "\56", "\50", "\51", "\133", "\135", "\173", "\175", "\74", "\74\75", "\76", 
"\76\75", "\75\75", "\41\75", "\46\46", "\174\174", "\41", 
"\142\157\157\154\145\141\156", "\142\162\145\141\153", "\143\154\141\163\163", "\144\157\165\142\154\145", 
"\145\154\163\145", "\145\170\164\145\156\144\163", "\146\157\162", "\151\146", 
"\151\155\160\154\145\155\145\156\164\163", "\151\156\164", "\151\156\164\145\162\146\141\143\145", "\156\145\167", 
"\156\145\167\141\162\162\141\171", "\156\165\154\154", "\160\162\151\156\164\154\156", 
"\162\145\141\144\154\156", "\162\145\164\165\162\156", "\163\164\162\151\156\147", "\166\157\151\144", 
"\167\150\151\154\145", null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3fffffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[28];
static private final int[] jjstateSet = new int[56];
static protected char curChar;
/** Constructor. */
public MyNewGrammarTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public MyNewGrammarTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 28; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
