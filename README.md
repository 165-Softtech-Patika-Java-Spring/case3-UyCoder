## Ödev şu şekilde tamalandı:

### isimlendirmeler:
| Turkce | Enlish Name |
|--------|-------------|
| Ürün   | Product     |
| Kullanıcı | User     |  
| Yorum  | Comment     |

### Bu Spring project'i için Maven'e eklenen dependency'ler:

- Spring Web
- Spring Data JPA
- PostgreSQL
- LOMBOK
- Swagger

### Önce taleplere göre databşe mimarını aşağıdaki şekilde yapmaya çalıştım.


<img src='https://user-images.githubusercontent.com/50663127/155712449-526040e8-eae0-4d8c-ab63-ed59e69c4819.PNG' width='600'>

### Proje'nin dosya yapisi:
```bash
case3
│  .gitignore
│  case3.iml
│  HELP.md
│  mvnw
│  pom.xml
└─src
   ├─main
   │  ├─java
   │  │  └─dev
   │  │      └─ahmed
   │  │          └─case3
   │  │              │  Case3Application.java
   │  │              │
   │  │              ├─controller
   │  │              │      CommentController.java
   │  │              │      ProductController.java
   │  │              │      UserController.java
   │  │              │
   │  │              ├─dao
   │  │              │      CommentDao.java
   │  │              │      ProductDao.java
   │  │              │      UserDao.java
   │  │              │
   │  │              ├─dto
   │  │              ├─entity
   │  │              │      Comment.java
   │  │              │      Product.java
   │  │              │      User.java
   │  │              │
   │  │              └─service
   │  │                  │  Service.java
   │  │                  │
   │  │                  └─entityservice
   │  │                          CommentEntityService.java
   │  │                          ProductEntityService.java
   │  │                          UserEntityService.java
   │  │
   │  └─resources
   │      │  application.properties
   │      │
   │      ├─static
   │      └─templates
   └─test
       └─java
           └─dev
               └─ahmed
                   └─case3
                           Case3ApplicationTests.java

```



# Case3
## Ödev Talepleri
Bir online alışveriş sitesinin kullanıcı yorumlarını yöneten bir api yazınız.
- Bir kullanıcının sadece bir e-maili ve bir telefon numarası olabilir.
- Aynı kullanıcı adı, telefon ya da e-mail ile kayıt yapılamaz.
- Kullanıcı tipi kişi ya da kurum olabilir.



1. **Ürün controller ında;**

 - Ürün kaydeden bir servis yazınız.
  
 - Ürünleri listeleyebilen bir servis yazınız.
  
 - Ürün idsinden ürünü bulan bir servis yazınız.
  
 - Ürün silen bir metot yazınız.
  
 - Ürün fiyatı güncelleyen bir metot yazınız. (Sadece fiyat)
  
  
  
2. **Kullanıcı controller ında;**


- Tüm kullanıcıları getiren bir servis yazınız.
- Kullanıcı idsinden kullanıcıyı getiren bir servis yazınız.
- Kullanıcı adından kullanıcıyı getiren bir servis yazınız.
- Kullanıcı kaydedilebilecek bir servis yazınız.
- Kullanıcı silebilecek bir servis yazınız. (kullanıcı adı, ve telefon bilgileri alınmalı). Eğer kullanıcı
adı ve telefon uyuşmuyorsa “XXX kullanıcı adı ile YYY telefonu bilgileri uyuşmamaktadır.”
şeklinde bir uyarı vermeil.
- Kullanıcı bilgilerini güncelleyebilecek bir servis yazınız.


3. **Yorum Controller ında;**
- Bir kullanıcının yaptığı yorumlari getiren bir servis yazınız. Eğer ilgili kullanıcının henüz bir
yorumu yoksa “XXX kullanıcı henüz bir yorum yazmamıştır” şeklinde bir hata vermeli.
- Bir ürüne yapılan tüm yorumları getiren bir servis yazınız. Eğer o ürüne henüz bir yorum
yazılmamışsa “XXX ürüne henüz bir yorum yazılmamıştır” şeklinde bir hata vermeli.
- Yeni bir yorum yazılabilecek bir servis yazınız.
- Yorum silebilecek bir servis yazınız.
#### Notlar:
Yukarıdaki hiçbir servis Persistance nesne almamalı ya da dönmemelidir.
Pathlere dikkat ediniz.
Dao ve entityService deki method isimlerine dikkat ediniz.
Dto isimlendirmeleri, fieldları vs size bırakıyorum.
Spring Data JPA da sorgu yazmak ile alakalı ya da otomatik sorguların nasıl yapıldığı ile alakalı da ufak
bir araştırma yapmanız gerekecek. 
