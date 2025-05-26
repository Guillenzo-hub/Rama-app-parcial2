package com.example.rama.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("") // Vista pública
@PageTitle("Inicio")
public class HomeView extends VerticalLayout {

    public HomeView() {
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setHeight("100vh");
        getStyle().set("background-color", "beige");

        Image logo = new Image("/images/logo.png", "Logo de Rama");
        logo.setWidth("200px");

        H1 titulo = new H1("Rama");
        titulo.getStyle().set("margin-top", "10px");

        Button startButton = new Button("Empezar");
        startButton.getStyle().set("background-color", "#6f4e37").set("color", "white");

        // Redirige al login de Auth0
        startButton.addClickListener(e ->
        startButton.getUI().ifPresent(ui ->
        ui.getPage().setLocation("/oauth2/authorization/auth0")
        )
        );

        add(
            logo,
            titulo,
            startButton
        );
    }
}



