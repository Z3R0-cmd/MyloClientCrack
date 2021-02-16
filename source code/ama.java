/*     */ import com.google.common.base.Function;
/*     */ import com.google.common.base.Joiner;
/*     */ import com.google.common.collect.HashBasedTable;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableTable;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class ama {
/*  16 */   private static final Joiner a = Joiner.on(", ");
/*  17 */   private static final Function<amo, String> b = new Function<amo, String>()
/*     */     {
/*     */       public String a(amo ☃)
/*     */       {
/*  21 */         return (☃ == null) ? "<NULL>" : ☃.a();
/*     */       }
/*     */     };
/*     */   
/*     */   private final afh c;
/*     */   private final ImmutableList<amo> d;
/*     */   private final ImmutableList<alz> e;
/*     */   
/*     */   public ama(afh ☃, amo... arrayOfAmo) {
/*  30 */     this.c = ☃;
/*     */ 
/*     */     
/*  33 */     Arrays.sort(arrayOfAmo, new Comparator<amo>(this)
/*     */         {
/*     */           public int a(amo ☃, amo amo1) {
/*  36 */             return ☃.a().compareTo(amo1.a());
/*     */           }
/*     */         });
/*  39 */     this.d = ImmutableList.copyOf((Object[])arrayOfAmo);
/*     */ 
/*     */     
/*  42 */     Map<Map<amo, Comparable>, a> map = Maps.newLinkedHashMap();
/*  43 */     List<a> list = Lists.newArrayList();
/*     */     
/*  45 */     Iterable<List<Comparable>> iterable = cm.a(e());
/*  46 */     for (Iterator<List<Comparable>> iterator1 = iterable.iterator(); iterator1.hasNext(); ) { List<Comparable> list1 = iterator1.next();
/*  47 */       Map<amo, Comparable> map1 = cw.b((Iterable<amo>)this.d, list1);
/*  48 */       a a = new a(☃, ImmutableMap.copyOf(map1));
/*     */       
/*  50 */       map.put(map1, a);
/*  51 */       list.add(a); }
/*     */ 
/*     */     
/*  54 */     for (Iterator<a> iterator = list.iterator(); iterator.hasNext(); ) { a a = iterator.next();
/*  55 */       a.a(map); }
/*     */ 
/*     */     
/*  58 */     this.e = ImmutableList.copyOf(list);
/*     */   }
/*     */   
/*     */   public ImmutableList<alz> a() {
/*  62 */     return this.e;
/*     */   }
/*     */   
/*     */   private List<Iterable<Comparable>> e() {
/*  66 */     List<Iterable<Comparable>> ☃ = Lists.newArrayList();
/*  67 */     for (int i = 0; i < this.d.size(); i++) {
/*  68 */       ☃.add(((amo<Comparable>)this.d.get(i)).c());
/*     */     }
/*     */     
/*  71 */     return ☃;
/*     */   }
/*     */   
/*     */   public alz b() {
/*  75 */     return (alz)this.e.get(0);
/*     */   }
/*     */   
/*     */   public afh c() {
/*  79 */     return this.c;
/*     */   }
/*     */   
/*     */   public Collection<amo> d() {
/*  83 */     return (Collection<amo>)this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  88 */     return Objects.toStringHelper(this).add("block", afh.c.c(this.c)).add("properties", Iterables.transform((Iterable)this.d, b)).toString();
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */     extends aly
/*     */   {
/*     */     private final afh a;
/*     */     private final ImmutableMap<amo, Comparable> b;
/*     */     private ImmutableTable<amo, Comparable, alz> c;
/*     */     
/*     */     private a(afh ☃, ImmutableMap<amo, Comparable> immutableMap) {
/* 100 */       this.a = ☃;
/* 101 */       this.b = immutableMap;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<amo> a() {
/* 106 */       return Collections.unmodifiableCollection((Collection<? extends amo>)this.b.keySet());
/*     */     }
/*     */ 
/*     */     
/*     */     public <T extends Comparable<T>> T b(amo<T> ☃) {
/* 111 */       if (!this.b.containsKey(☃)) {
/* 112 */         throw new IllegalArgumentException("Cannot get property " + ☃ + " as it does not exist in " + this.a.P());
/*     */       }
/*     */       
/* 115 */       return (T)☃.b().cast(this.b.get(☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public <T extends Comparable<T>, V extends T> alz a(amo<T> ☃, V v) {
/* 120 */       if (!this.b.containsKey(☃)) {
/* 121 */         throw new IllegalArgumentException("Cannot set property " + ☃ + " as it does not exist in " + this.a.P());
/*     */       }
/* 123 */       if (!☃.c().contains(v)) {
/* 124 */         throw new IllegalArgumentException("Cannot set property " + ☃ + " to " + v + " on block " + afh.c.c(this.a) + ", it is not an allowed value");
/*     */       }
/* 126 */       if (this.b.get(☃) == v) {
/* 127 */         return this;
/*     */       }
/*     */       
/* 130 */       return (alz)this.c.get(☃, v);
/*     */     }
/*     */ 
/*     */     
/*     */     public ImmutableMap<amo, Comparable> b() {
/* 135 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public afh c() {
/* 140 */       return this.a;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 146 */       return (this == ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 151 */       return this.b.hashCode();
/*     */     }
/*     */     
/*     */     public void a(Map<Map<amo, Comparable>, a> ☃) {
/* 155 */       if (this.c != null) {
/* 156 */         throw new IllegalStateException();
/*     */       }
/*     */       
/* 159 */       HashBasedTable hashBasedTable = HashBasedTable.create();
/* 160 */       for (Iterator<amo<? extends Comparable>> iterator = this.b.keySet().iterator(); iterator.hasNext(); ) { amo<? extends Comparable> amo = iterator.next();
/* 161 */         for (Iterator<Comparable> iterator1 = amo.c().iterator(); iterator1.hasNext(); ) { Comparable comparable = iterator1.next();
/* 162 */           if (comparable != this.b.get(amo)) {
/* 163 */             hashBasedTable.put(amo, comparable, ☃.get(b(amo, comparable)));
/*     */           } }
/*     */          }
/*     */ 
/*     */       
/* 168 */       this.c = ImmutableTable.copyOf((Table)hashBasedTable);
/*     */     }
/*     */     
/*     */     private Map<amo, Comparable> b(amo ☃, Comparable comparable) {
/* 172 */       Map<amo, Comparable> map = Maps.newHashMap((Map)this.b);
/* 173 */       map.put(☃, comparable);
/* 174 */       return map;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ama.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */