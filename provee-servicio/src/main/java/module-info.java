module proveeservicio {
    requires jarservicio;
    provides com.sebastian.jarservicio.Servicio with com.sebastian.provee.servicio.Implementacion;
}
