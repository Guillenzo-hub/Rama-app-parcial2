package com.example.rama.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

// ✅ CORREGIDO: Usar nueva ruta base de Vaadin
@Route("app/dashboard")
@PageTitle("Dashboard")
public class DashboardView extends VerticalLayout {

    public DashboardView() {
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setHeight("100vh");
        getStyle().set("background-color", "beige");

        Image logo = new Image("/images/logo.png", "Logo de Rama");
        logo.setWidth("150px");

        H1 titulo = new H1("Panel de Control");

        Button btnGrupo = new Button("Gestión de Grupos");
        btnGrupo.getStyle().set("background-color", "#6f4e37").set("color", "white");
        btnGrupo.addClickListener(e ->
            btnGrupo.getUI().ifPresent(ui -> ui.navigate("app/grupos"))
        );

        Button btnMateria = new Button("Gestión de Materias");
        btnMateria.getStyle().set("background-color", "#6f4e37").set("color", "white");
        btnMateria.addClickListener(e ->
            btnMateria.getUI().ifPresent(ui -> ui.navigate("app/materia"))
        );

        Button btnActividades = new Button("Gestión de Actividades");
        btnActividades.getStyle().set("background-color", "#6f4e37").set("color", "white");
        btnActividades.addClickListener(e ->
            btnActividades.getUI().ifPresent(ui -> ui.navigate("app/actividades"))
        );

        // ✅ AÑADIDO: Botón de logout
        Button btnLogout = new Button("Cerrar Sesión");
        btnLogout.getStyle().set("background-color", "#d32f2f").set("color", "white");
        btnLogout.addClickListener(e ->
            btnLogout.getUI().ifPresent(ui -> ui.getPage().setLocation("/logout"))
        );

        add(
            logo,
            titulo,
            btnGrupo,
            btnMateria,
            btnActividades,
            btnLogout
        );
    }
}
