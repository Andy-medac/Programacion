

package com.mycompany.ejerciciopablo;


public class Nota {
        private Long id; 
        private Long idAlumno; 
        private String asignatura; 
        private Double nota; 
        
        public Nota(){
            
        }
        
        public Nota(Long id, Long idAlumno, String asignatura , Double nota ){
            this(); 
            this.id = id; 
            this.idAlumno = idAlumno; 
            this.asignatura = asignatura; 
            this.nota = nota; 
            
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getIdAlumno() {
            return idAlumno;
        }

        public void setIdAlumno(Long idAlumno) {
            this.idAlumno = idAlumno;
        }

        public String getAsignatura() {
            return asignatura;
        }

        public void setAsignatura(String asignatura) {
            this.asignatura = asignatura;
        }

        public Double getNota() {
            return nota;
        }

        public void setNota(Double nota) {
            this.nota = nota;
        }

        @Override
        public String toString() {
            return "Nota{" + "id=" + id + ", idAlumno=" + idAlumno + ", asignatura=" + asignatura + ", nota=" + nota + '}';
        }
}
