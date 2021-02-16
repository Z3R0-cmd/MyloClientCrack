/*    */ package com.jcraft.jorbis;
/*    */ 
/*    */ import com.jcraft.jogg.Buffer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class FuncMapping
/*    */ {
/* 32 */   public static FuncMapping[] mapping_P = new FuncMapping[] { new Mapping0() };
/*    */   
/*    */   abstract void pack(Info paramInfo, Object paramObject, Buffer paramBuffer);
/*    */   
/*    */   abstract Object unpack(Info paramInfo, Buffer paramBuffer);
/*    */   
/*    */   abstract Object look(DspState paramDspState, InfoMode paramInfoMode, Object paramObject);
/*    */   
/*    */   abstract void free_info(Object paramObject);
/*    */   
/*    */   abstract void free_look(Object paramObject);
/*    */   
/*    */   abstract int inverse(Block paramBlock, Object paramObject);
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/jcraft/jorbis/FuncMapping.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */