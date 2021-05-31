����   4 7  (com/hospital/controller/LogoutController  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this *Lcom/hospital/controller/LogoutController; logout c(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Ljava/lang/String; RuntimeVisibleAnnotations 8Lorg/springframework/web/bind/annotation/RequestMapping; value /logout method 7Lorg/springframework/web/bind/annotation/RequestMethod; GET
    ?org/springframework/security/core/context/SecurityContextHolder   
getContext =()Lorg/springframework/security/core/context/SecurityContext;     9org/springframework/security/core/context/SecurityContext ! " getAuthentication 4()Lorg/springframework/security/core/Authentication; $ Sorg/springframework/security/web/authentication/logout/SecurityContextLogoutHandler
 # 	
 # '  ( �(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;Lorg/springframework/security/core/Authentication;)V * 
redirect:/ request 'Ljavax/servlet/http/HttpServletRequest; response (Ljavax/servlet/http/HttpServletResponse; authentication 2Lorg/springframework/security/core/Authentication; StackMapTable 3 0org/springframework/security/core/Authentication 
SourceFile LogoutController.java +Lorg/springframework/stereotype/Controller; !               /     *� �    
                               [ s  [ e      �     � �  N-� � #Y� %+,-� &)�    
   "         	             *            + ,     - .  	  / 0  1    �  2  4    5      6  