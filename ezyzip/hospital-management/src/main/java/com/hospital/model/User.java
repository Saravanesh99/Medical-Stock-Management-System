????   4 9  'com/hospital/controller/ErrorController  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this )Lcom/hospital/controller/ErrorController; handleException l(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/Exception;)Lorg/springframework/web/servlet/ModelAndView; RuntimeVisibleAnnotations :Lorg/springframework/web/bind/annotation/ExceptionHandler; value Ljava/lang/Exception;  ,org/springframework/web/servlet/ModelAndView
  	  	exception
    java/lang/Exception   getLocalizedMessage ()Ljava/lang/String;
    ! " 	addObject T(Ljava/lang/String;Ljava/lang/Object;)Lorg/springframework/web/servlet/ModelAndView; $ url & ( ' %javax/servlet/http/HttpServletRequest ) * getRequestURL ()Ljava/lang/StringBuffer; , error
  . / 0 setViewName (Ljava/lang/String;)V request 'Ljavax/servlet/http/HttpServletRequest; ex mv .Lorg/springframework/web/servlet/ModelAndView; 
SourceFile ErrorController.java +Lorg/springframework/stereotype/Controller; !               /     *? ?    
       
                        [ c     ?     (? Y? N-,? ? W-#+? % ? W-+? --?    
               &     *    (       ( 1 2    ( 3      4 5   6    7      8  s ,