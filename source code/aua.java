/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aua
/*     */ {
/*     */   private atp b;
/*  17 */   protected Map<String, ate> a = Maps.newHashMap();
/*  18 */   private List<ate> c = Lists.newArrayList();
/*  19 */   private Map<String, Short> d = Maps.newHashMap();
/*     */   
/*     */   public aua(atp ☃) {
/*  22 */     this.b = ☃;
/*  23 */     b();
/*     */   }
/*     */   
/*     */   public ate a(Class<? extends ate> ☃, String str) {
/*  27 */     ate ate = this.a.get(str);
/*  28 */     if (ate != null) {
/*  29 */       return ate;
/*     */     }
/*     */     
/*  32 */     if (this.b != null) {
/*     */       try {
/*  34 */         File file = this.b.a(str);
/*  35 */         if (file != null && file.exists()) {
/*     */           try {
/*  37 */             ate = ☃.getConstructor(new Class[] { String.class }).newInstance(new Object[] { str });
/*  38 */           } catch (Exception exception) {
/*  39 */             throw new RuntimeException("Failed to instantiate " + ☃.toString(), exception);
/*     */           } 
/*     */           
/*  42 */           FileInputStream fileInputStream = new FileInputStream(file);
/*  43 */           dn dn = dx.a(fileInputStream);
/*  44 */           fileInputStream.close();
/*     */           
/*  46 */           ate.a(dn.m("data"));
/*     */         } 
/*  48 */       } catch (Exception exception) {
/*  49 */         exception.printStackTrace();
/*     */       } 
/*     */     }
/*     */     
/*  53 */     if (ate != null) {
/*  54 */       this.a.put(str, ate);
/*  55 */       this.c.add(ate);
/*     */     } 
/*  57 */     return ate;
/*     */   }
/*     */   
/*     */   public void a(String ☃, ate ate1) {
/*  61 */     if (this.a.containsKey(☃)) {
/*  62 */       this.c.remove(this.a.remove(☃));
/*     */     }
/*  64 */     this.a.put(☃, ate1);
/*  65 */     this.c.add(ate1);
/*     */   }
/*     */   
/*     */   public void a() {
/*  69 */     for (int ☃ = 0; ☃ < this.c.size(); ☃++) {
/*  70 */       ate ate = this.c.get(☃);
/*  71 */       if (ate.d()) {
/*  72 */         a(ate);
/*  73 */         ate.a(false);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(ate ☃) {
/*  79 */     if (this.b == null) {
/*     */       return;
/*     */     }
/*     */     try {
/*  83 */       File file = this.b.a(☃.a);
/*  84 */       if (file != null) {
/*  85 */         dn dn1 = new dn();
/*  86 */         ☃.b(dn1);
/*     */         
/*  88 */         dn dn2 = new dn();
/*  89 */         dn2.a("data", dn1);
/*     */         
/*  91 */         FileOutputStream fileOutputStream = new FileOutputStream(file);
/*  92 */         dx.a(dn2, fileOutputStream);
/*  93 */         fileOutputStream.close();
/*     */       } 
/*  95 */     } catch (Exception exception) {
/*  96 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b() {
/*     */     try {
/* 102 */       this.d.clear();
/* 103 */       if (this.b == null) {
/*     */         return;
/*     */       }
/* 106 */       File ☃ = this.b.a("idcounts");
/* 107 */       if (☃ != null && ☃.exists()) {
/* 108 */         DataInputStream dataInputStream = new DataInputStream(new FileInputStream(☃));
/* 109 */         dn dn = dx.a(dataInputStream);
/* 110 */         dataInputStream.close();
/*     */         
/* 112 */         for (Iterator<String> iterator = dn.c().iterator(); iterator.hasNext(); ) { String str = iterator.next();
/* 113 */           eb eb = dn.a(str);
/* 114 */           if (eb instanceof dz) {
/* 115 */             dz dz = (dz)eb;
/* 116 */             String str1 = str;
/* 117 */             short s = dz.e();
/* 118 */             this.d.put(str1, Short.valueOf(s));
/*     */           }  }
/*     */       
/*     */       } 
/* 122 */     } catch (Exception ☃) {
/* 123 */       ☃.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(String ☃) {
/* 128 */     Short short_ = this.d.get(☃);
/* 129 */     if (short_ == null) {
/* 130 */       short_ = Short.valueOf((short)0);
/*     */     } else {
/* 132 */       Short short_1 = short_, short_2 = short_ = Short.valueOf((short)(short_.shortValue() + 1));
/*     */     } 
/*     */     
/* 135 */     this.d.put(☃, short_);
/* 136 */     if (this.b == null) {
/* 137 */       return short_.shortValue();
/*     */     }
/*     */     try {
/* 140 */       File file = this.b.a("idcounts");
/* 141 */       if (file != null) {
/* 142 */         dn dn = new dn();
/*     */         
/* 144 */         for (Iterator<String> iterator = this.d.keySet().iterator(); iterator.hasNext(); ) { String str = iterator.next();
/* 145 */           short s = ((Short)this.d.get(str)).shortValue();
/* 146 */           dn.a(str, s); }
/*     */ 
/*     */         
/* 149 */         DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
/* 150 */         dx.a(dn, dataOutputStream);
/* 151 */         dataOutputStream.close();
/*     */       } 
/* 153 */     } catch (Exception exception) {
/* 154 */       exception.printStackTrace();
/*     */     } 
/* 156 */     return short_.shortValue();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */