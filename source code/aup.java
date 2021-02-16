/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aup
/*     */   extends ate
/*     */ {
/*  16 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private auo c;
/*     */   
/*     */   private dn d;
/*     */   
/*     */   public aup() {
/*  23 */     this("scoreboard");
/*     */   }
/*     */   
/*     */   public aup(String ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */   
/*     */   public void a(auo ☃) {
/*  31 */     this.c = ☃;
/*     */     
/*  33 */     if (this.d != null) {
/*  34 */       a(this.d);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/*  40 */     if (this.c == null) {
/*  41 */       this.d = ☃;
/*     */       
/*     */       return;
/*     */     } 
/*  45 */     b(☃.c("Objectives", 10));
/*  46 */     c(☃.c("PlayerScores", 10));
/*     */     
/*  48 */     if (☃.b("DisplaySlots", 10)) {
/*  49 */       c(☃.m("DisplaySlots"));
/*     */     }
/*     */     
/*  52 */     if (☃.b("Teams", 9)) {
/*  53 */       a(☃.c("Teams", 10));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(du ☃) {
/*  58 */     for (int i = 0; i < ☃.c(); i++) {
/*  59 */       dn dn1 = ☃.b(i);
/*     */       
/*  61 */       String str1 = dn1.j("Name");
/*  62 */       if (str1.length() > 16)
/*     */       {
/*  64 */         str1 = str1.substring(0, 16);
/*     */       }
/*  66 */       aul aul = this.c.e(str1);
/*  67 */       String str2 = dn1.j("DisplayName");
/*  68 */       if (str2.length() > 32)
/*     */       {
/*  70 */         str2 = str2.substring(0, 32);
/*     */       }
/*  72 */       aul.a(str2);
/*  73 */       if (dn1.b("TeamColor", 8)) {
/*  74 */         aul.a(a.b(dn1.j("TeamColor")));
/*     */       }
/*  76 */       aul.b(dn1.j("Prefix"));
/*  77 */       aul.c(dn1.j("Suffix"));
/*  78 */       if (dn1.b("AllowFriendlyFire", 99)) {
/*  79 */         aul.a(dn1.n("AllowFriendlyFire"));
/*     */       }
/*  81 */       if (dn1.b("SeeFriendlyInvisibles", 99)) {
/*  82 */         aul.b(dn1.n("SeeFriendlyInvisibles"));
/*     */       }
/*  84 */       if (dn1.b("NameTagVisibility", 8)) {
/*  85 */         auq.a a = auq.a.a(dn1.j("NameTagVisibility"));
/*  86 */         if (a != null) {
/*  87 */           aul.a(a);
/*     */         }
/*     */       } 
/*  90 */       if (dn1.b("DeathMessageVisibility", 8)) {
/*  91 */         auq.a a = auq.a.a(dn1.j("DeathMessageVisibility"));
/*  92 */         if (a != null) {
/*  93 */           aul.b(a);
/*     */         }
/*     */       } 
/*     */       
/*  97 */       a(aul, dn1.c("Players", 8));
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(aul ☃, du du1) {
/* 102 */     for (int i = 0; i < du1.c(); i++) {
/* 103 */       this.c.a(du1.f(i), ☃.b());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(dn ☃) {
/* 108 */     for (int i = 0; i < 19; i++) {
/* 109 */       if (☃.b("slot_" + i, 8)) {
/* 110 */         String str = ☃.j("slot_" + i);
/* 111 */         auk auk = this.c.b(str);
/* 112 */         this.c.a(i, auk);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(du ☃) {
/* 118 */     for (int i = 0; i < ☃.c(); i++) {
/* 119 */       dn dn1 = ☃.b(i);
/*     */       
/* 121 */       auu auu = auu.a.get(dn1.j("CriteriaName"));
/* 122 */       if (auu != null) {
/*     */ 
/*     */         
/* 125 */         String str = dn1.j("Name");
/* 126 */         if (str.length() > 16)
/*     */         {
/* 128 */           str = str.substring(0, 16);
/*     */         }
/* 130 */         auk auk = this.c.a(str, auu);
/* 131 */         auk.a(dn1.j("DisplayName"));
/* 132 */         auk.a(auu.a.a(dn1.j("RenderType")));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   protected void c(du ☃) {
/* 137 */     for (int i = 0; i < ☃.c(); i++) {
/* 138 */       dn dn1 = ☃.b(i);
/*     */       
/* 140 */       auk auk = this.c.b(dn1.j("Objective"));
/* 141 */       String str = dn1.j("Name");
/* 142 */       if (str.length() > 40)
/*     */       {
/* 144 */         str = str.substring(0, 40);
/*     */       }
/* 146 */       aum aum = this.c.c(str, auk);
/* 147 */       aum.c(dn1.f("Score"));
/* 148 */       if (dn1.c("Locked")) {
/* 149 */         aum.a(dn1.n("Locked"));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 156 */     if (this.c == null) {
/* 157 */       b.warn("Tried to save scoreboard without having a scoreboard...");
/*     */       
/*     */       return;
/*     */     } 
/* 161 */     ☃.a("Objectives", b());
/* 162 */     ☃.a("PlayerScores", e());
/* 163 */     ☃.a("Teams", a());
/*     */     
/* 165 */     d(☃);
/*     */   }
/*     */   
/*     */   protected du a() {
/* 169 */     du ☃ = new du();
/* 170 */     Collection<aul> collection = this.c.g();
/*     */     
/* 172 */     for (Iterator<aul> iterator = collection.iterator(); iterator.hasNext(); ) { aul aul = iterator.next();
/* 173 */       dn dn1 = new dn();
/*     */       
/* 175 */       dn1.a("Name", aul.b());
/* 176 */       dn1.a("DisplayName", aul.c());
/* 177 */       if (aul.l().b() >= 0) {
/* 178 */         dn1.a("TeamColor", aul.l().e());
/*     */       }
/* 180 */       dn1.a("Prefix", aul.e());
/* 181 */       dn1.a("Suffix", aul.f());
/* 182 */       dn1.a("AllowFriendlyFire", aul.g());
/* 183 */       dn1.a("SeeFriendlyInvisibles", aul.h());
/* 184 */       dn1.a("NameTagVisibility", (aul.i()).e);
/* 185 */       dn1.a("DeathMessageVisibility", (aul.j()).e);
/*     */       
/* 187 */       du du = new du();
/*     */       
/* 189 */       for (Iterator<String> iterator1 = aul.d().iterator(); iterator1.hasNext(); ) { String str = iterator1.next();
/* 190 */         du.a(new ea(str)); }
/*     */ 
/*     */       
/* 193 */       dn1.a("Players", du);
/*     */       
/* 195 */       ☃.a(dn1); }
/*     */ 
/*     */     
/* 198 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void d(dn ☃) {
/* 202 */     dn dn1 = new dn();
/* 203 */     boolean bool = false;
/*     */     
/* 205 */     for (int i = 0; i < 19; i++) {
/* 206 */       auk auk = this.c.a(i);
/*     */       
/* 208 */       if (auk != null) {
/* 209 */         dn1.a("slot_" + i, auk.b());
/* 210 */         bool = true;
/*     */       } 
/*     */     } 
/*     */     
/* 214 */     if (bool) {
/* 215 */       ☃.a("DisplaySlots", dn1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected du b() {
/* 220 */     du ☃ = new du();
/* 221 */     Collection<auk> collection = this.c.c();
/*     */     
/* 223 */     for (Iterator<auk> iterator = collection.iterator(); iterator.hasNext(); ) { auk auk = iterator.next();
/* 224 */       if (auk.c() == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 228 */       dn dn1 = new dn();
/* 229 */       dn1.a("Name", auk.b());
/* 230 */       dn1.a("CriteriaName", auk.c().a());
/* 231 */       dn1.a("DisplayName", auk.d());
/* 232 */       dn1.a("RenderType", auk.e().a());
/*     */       
/* 234 */       ☃.a(dn1); }
/*     */ 
/*     */     
/* 237 */     return ☃;
/*     */   }
/*     */   
/*     */   protected du e() {
/* 241 */     du ☃ = new du();
/* 242 */     Collection<aum> collection = this.c.e();
/*     */     
/* 244 */     for (Iterator<aum> iterator = collection.iterator(); iterator.hasNext(); ) { aum aum = iterator.next();
/* 245 */       if (aum.d() == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 249 */       dn dn1 = new dn();
/* 250 */       dn1.a("Name", aum.e());
/* 251 */       dn1.a("Objective", aum.d().b());
/* 252 */       dn1.a("Score", aum.c());
/* 253 */       dn1.a("Locked", aum.g());
/*     */       
/* 255 */       ☃.a(dn1); }
/*     */ 
/*     */     
/* 258 */     return ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */