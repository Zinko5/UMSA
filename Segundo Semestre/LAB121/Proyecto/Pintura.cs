using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Proyecto
{
    public class Pintura:Arte
    {
        private string Tecnica;
        public string tecnica
        {
            get { return Tecnica; }
            set { Tecnica = value; }
        }
        public void Leer()
        {
            System.Console.WriteLine("Leer genero: ");
            Tecnica = Console.ReadLine();
        }
        public void Mostrar()
        {
            base.Mostrar();
            System.Console.WriteLine(Tecnica);
        }
    }
}