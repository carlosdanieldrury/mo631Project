# Projeto Disciplina MO631 - Unicamp IC 2019 Segundo Semestre

Este tem projeto tem o intuito de criar uma DSL que possa criar transformações de modelos para a criação de um arquivo XML representando uma View de uma aplicação para Android.

Os objetos do modelo que podem ser utilizados na DSL são:
    - ViewGroup
    - TextView
    - EditText
    - Button
    

A DSL foi definida da seguinte forma:


    'ViewGroup'
	'{'
		'id' "id"
		'layout_width' "wrap_content" (ou "match_parent")
		'layout_height' "wrap_content" (ou "match_parent")
		'views' '{'
	        View* (Button, ou EditText ou TextView)
	    '}'
	'}'
	'Button'
	'{'
		'id' "id"
		'layout_width' "wrap_content" (ou "match_parent")
		'layout_height' "wrap_content" (ou "match_parent")
		'text' "Text"
		'start' Position
		'end' Position
		'top' Position
		'bottom' Position
	'}'
	
	'EditText'
	'{'
		'id' "id"
		'layout_width' "wrap_content" (ou "match_parent")
		'layout_height' "wrap_content" (ou "match_parent")
		'text' "Text"
		'start' Position
		'end' Position
		'top' Position
		'bottom' Position
	'}'
	
	'TextView'
	'{'
		'id' "id"
		'layout_width' "wrap_content" (ou "match_parent")
		'layout_height' "wrap_content" (ou "match_parent")
		'text' "Text"
		'start' Position
		'end' Position
		'top' Position
		'bottom' Position
	'}'

    Position = 'STARTOF' | 'ENDOF' | 'TOPOF' | 'BOTTOMOF'

# Ecore Project

  - org.drury.mo361.ecore
    Este projeto contém o metamodelo do que foi feito para o trabalho.


# Model to Text Transformation
  - org.drury.mo631.acceleo

    Utilizando o seguinte trecho de código em um arquivo XMI, teremos um resultado em XML logo abaixo:
    
XMI
    
    <?xml version="1.0" encoding="UTF-8"?>
    <project:ViewGroup
    xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:project="http://org.drury.mo631/druryMO631"
    xsi:schemaLocation="http://org.drury.mo631/druryMO631 ../org.drury.mo361.ecore/model/druryMO631.ecore">
    <views xsi:type="project:Button"
      id="button"
      layout_width="wrap_content"
      layout_height="wrap_content"
      text="Botão">
    <start/>
    <end positionDestination="ENDOF"/>
    <top positionDestination="TOPOF"/>
    </views>
    <views xsi:type="project:TextView"
      id="text_view"
      layout_width="match_parent"
      layout_height="wrap_content"
      text="Texto">
    <start/>
    <end positionDestination="ENDOF"/>
    <top positionDestination="BOTTOMOF"
        view="//@views.0"/>
    </views>
    <views xsi:type="project:EditText"
      id="edit_text"
      layout_width="wrap_content"
      layout_height="wrap_content"
      text="Edit Text">
    <start/>
    <end positionDestination="ENDOF"/>
    <top positionDestination="BOTTOMOF"
        view="//@views.1"/>
    </views>
    </project:ViewGroup>

XML

    <?xml version="1.0" encoding="utf-8"?>
    <layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools">

    <androidx.constraintlayout.widget.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">

        <androidx.appcompat.widget.AppCompatButton
                android:id="@+id/button"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Botão"
                app:layout_constraintStart_toStartOf

                        ="parent"
                app:layout_constraintEnd_toEndOf

                        ="parent"
                app:layout_constraintTop_toTopOf

                        ="parent"
        />
        <androidx.appcompat.widget.AppCompatTextView
                android:id="@+id/text_view"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Texto"
                app:layout_constraintStart_toStartOf

                        ="parent"
                app:layout_constraintEnd_toEndOf

                        ="parent"
                app:layout_constraintTop_toBottomOf

                        ="@+id/button"
        />
        <androidx.appcompat.widget.AppCompatEditText
                android:id="@+id/edit_text"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Edit Text"
                app:layout_constraintStart_toStartOf

                        ="parent"
                app:layout_constraintEnd_toEndOf

                        ="parent"
                app:layout_constraintTop_toBottomOf

                        ="@+id/text_view"
        />

    </androidx.constraintlayout.widget.ConstraintLayout>

    </layout>



# Text to Model Transformation
  - org.drury.mo631.xtext
 
    Seguir os dados da DSL acima e utilizar uma instancia do Eclipse Standalone para realizar o teste da transformação.
 
