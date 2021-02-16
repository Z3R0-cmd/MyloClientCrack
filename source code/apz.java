/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class apz
/*     */ {
/*  26 */   private final List<aqa> a = Lists.newArrayList();
/*  27 */   private final Map<String, Map<String, String>> b = Maps.newHashMap();
/*     */   private int c;
/*     */   
/*     */   public int a() {
/*  31 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  35 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public Map<String, Map<String, String>> b() {
/*  39 */     return this.b;
/*     */   }
/*     */   
/*     */   public List<aqa> c() {
/*  43 */     return this.a;
/*     */   }
/*     */   
/*     */   public void d() {
/*  47 */     int ☃ = 0;
/*     */     
/*  49 */     for (Iterator<aqa> iterator = this.a.iterator(); iterator.hasNext(); ) { aqa aqa = iterator.next();
/*  50 */       aqa.b(☃);
/*  51 */       ☃ += aqa.b(); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  57 */     StringBuilder ☃ = new StringBuilder();
/*     */     
/*  59 */     ☃.append(3);
/*  60 */     ☃.append(";");
/*     */     int i;
/*  62 */     for (i = 0; i < this.a.size(); i++) {
/*  63 */       if (i > 0) {
/*  64 */         ☃.append(",");
/*     */       }
/*  66 */       ☃.append(((aqa)this.a.get(i)).toString());
/*     */     } 
/*     */     
/*  69 */     ☃.append(";");
/*  70 */     ☃.append(this.c);
/*     */     
/*  72 */     if (!this.b.isEmpty()) {
/*  73 */       ☃.append(";");
/*  74 */       i = 0;
/*     */       
/*  76 */       for (Iterator<Map.Entry<String, Map<String, String>>> iterator = this.b.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<String, Map<String, String>> entry = iterator.next();
/*  77 */         if (i++ > 0) {
/*  78 */           ☃.append(",");
/*     */         }
/*  80 */         ☃.append(((String)entry.getKey()).toLowerCase());
/*     */         
/*  82 */         Map<String, String> map = entry.getValue();
/*  83 */         if (!map.isEmpty()) {
/*  84 */           ☃.append("(");
/*  85 */           int j = 0;
/*     */           
/*  87 */           for (Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator(); iterator1.hasNext(); ) { Map.Entry<String, String> entry1 = iterator1.next();
/*  88 */             if (j++ > 0) {
/*  89 */               ☃.append(" ");
/*     */             }
/*  91 */             ☃.append(entry1.getKey());
/*  92 */             ☃.append("=");
/*  93 */             ☃.append(entry1.getValue()); }
/*     */ 
/*     */           
/*  96 */           ☃.append(")");
/*     */         }  }
/*     */     
/*     */     } else {
/* 100 */       ☃.append(";");
/*     */     } 
/*     */     
/* 103 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   private static aqa a(int ☃, String str, int i) {
/* 107 */     String[] arrayOfString = (☃ >= 3) ? str.split("\\*", 2) : str.split("x", 2);
/* 108 */     int j = 1;
/* 109 */     int k = 0;
/*     */     
/* 111 */     if (arrayOfString.length == 2) {
/*     */       try {
/* 113 */         j = Integer.parseInt(arrayOfString[0]);
/* 114 */         if (i + j >= 256) {
/* 115 */           j = 256 - i;
/*     */         }
/* 117 */         if (j < 0) {
/* 118 */           j = 0;
/*     */         }
/* 120 */       } catch (Throwable throwable) {
/* 121 */         return null;
/*     */       } 
/*     */     }
/*     */     
/* 125 */     afh afh = null;
/*     */     try {
/* 127 */       String str1 = arrayOfString[arrayOfString.length - 1];
/* 128 */       if (☃ < 3) {
/* 129 */         arrayOfString = str1.split(":", 2);
/* 130 */         if (arrayOfString.length > 1) {
/* 131 */           k = Integer.parseInt(arrayOfString[1]);
/*     */         }
/* 133 */         afh = afh.c(Integer.parseInt(arrayOfString[0]));
/*     */       } else {
/* 135 */         arrayOfString = str1.split(":", 3);
/* 136 */         afh = (arrayOfString.length > 1) ? afh.b(arrayOfString[0] + ":" + arrayOfString[1]) : null;
/* 137 */         if (afh != null) {
/* 138 */           k = (arrayOfString.length > 2) ? Integer.parseInt(arrayOfString[2]) : 0;
/*     */         } else {
/* 140 */           afh = afh.b(arrayOfString[0]);
/* 141 */           if (afh != null) {
/* 142 */             k = (arrayOfString.length > 1) ? Integer.parseInt(arrayOfString[1]) : 0;
/*     */           }
/*     */         } 
/* 145 */         if (afh == null) {
/* 146 */           return null;
/*     */         }
/*     */       } 
/*     */       
/* 150 */       if (afh == afi.a) {
/* 151 */         k = 0;
/*     */       }
/*     */       
/* 154 */       if (k < 0 || k > 15) {
/* 155 */         k = 0;
/*     */       }
/* 157 */     } catch (Throwable throwable) {
/* 158 */       return null;
/*     */     } 
/*     */     
/* 161 */     aqa aqa = new aqa(☃, j, afh, k);
/* 162 */     aqa.b(i);
/* 163 */     return aqa;
/*     */   }
/*     */   
/*     */   private static List<aqa> a(int ☃, String str) {
/* 167 */     if (str == null || str.length() < 1) {
/* 168 */       return null;
/*     */     }
/*     */     
/* 171 */     List<aqa> list = Lists.newArrayList();
/* 172 */     String[] arrayOfString1 = str.split(",");
/* 173 */     int i = 0; String[] arrayOfString2;
/*     */     int j, k;
/* 175 */     for (arrayOfString2 = arrayOfString1, j = arrayOfString2.length, k = 0; k < j; ) { String str1 = arrayOfString2[k];
/* 176 */       aqa aqa = a(☃, str1, i);
/* 177 */       if (aqa == null) {
/* 178 */         return null;
/*     */       }
/* 180 */       list.add(aqa);
/* 181 */       i += aqa.b();
/*     */       k++; }
/*     */     
/* 184 */     return list;
/*     */   }
/*     */   
/*     */   public static apz a(String ☃) {
/* 188 */     if (☃ == null) {
/* 189 */       return e();
/*     */     }
/* 191 */     String[] arrayOfString = ☃.split(";", -1);
/* 192 */     int i = (arrayOfString.length == 1) ? 0 : ns.a(arrayOfString[0], 0);
/* 193 */     if (i < 0 || i > 3) {
/* 194 */       return e();
/*     */     }
/*     */     
/* 197 */     apz apz1 = new apz();
/* 198 */     int j = (arrayOfString.length == 1) ? 0 : 1;
/* 199 */     List<aqa> list = a(i, arrayOfString[j++]);
/*     */     
/* 201 */     if (list == null || list.isEmpty()) {
/* 202 */       return e();
/*     */     }
/*     */     
/* 205 */     apz1.c().addAll(list);
/* 206 */     apz1.d();
/*     */     
/* 208 */     int k = ady.q.az;
/* 209 */     if (i > 0 && arrayOfString.length > j) {
/* 210 */       k = ns.a(arrayOfString[j++], k);
/*     */     }
/* 212 */     apz1.a(k);
/*     */     
/* 214 */     if (i > 0 && arrayOfString.length > j) {
/* 215 */       String[] arrayOfString1 = arrayOfString[j++].toLowerCase().split(","); String[] arrayOfString2;
/*     */       int m, n;
/* 217 */       for (arrayOfString2 = arrayOfString1, m = arrayOfString2.length, n = 0; n < m; ) { String str = arrayOfString2[n];
/* 218 */         String[] arrayOfString3 = str.split("\\(", 2);
/* 219 */         Map<String, String> map = Maps.newHashMap();
/*     */         
/* 221 */         if (arrayOfString3[0].length() > 0) {
/* 222 */           apz1.b().put(arrayOfString3[0], map);
/*     */           
/* 224 */           if (arrayOfString3.length > 1 && arrayOfString3[1].endsWith(")") && arrayOfString3[1].length() > 1) {
/* 225 */             String[] arrayOfString4 = arrayOfString3[1].substring(0, arrayOfString3[1].length() - 1).split(" ");
/*     */             
/* 227 */             for (int i1 = 0; i1 < arrayOfString4.length; i1++) {
/* 228 */               String[] arrayOfString5 = arrayOfString4[i1].split("=", 2);
/* 229 */               if (arrayOfString5.length == 2)
/* 230 */                 map.put(arrayOfString5[0], arrayOfString5[1]); 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         n++; }
/*     */     
/*     */     } else {
/* 237 */       apz1.b().put("village", Maps.newHashMap());
/*     */     } 
/*     */     
/* 240 */     return apz1;
/*     */   }
/*     */   
/*     */   public static apz e() {
/* 244 */     apz ☃ = new apz();
/*     */     
/* 246 */     ☃.a(ady.q.az);
/* 247 */     ☃.c().add(new aqa(1, afi.h));
/* 248 */     ☃.c().add(new aqa(2, afi.d));
/* 249 */     ☃.c().add(new aqa(1, afi.c));
/* 250 */     ☃.d();
/* 251 */     ☃.b().put("village", Maps.newHashMap());
/*     */     
/* 253 */     return ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */