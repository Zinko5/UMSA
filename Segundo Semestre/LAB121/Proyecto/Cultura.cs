using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Proyecto
{
    public class Cultura
    {
        private string Historia;
        public string historia
        {
            get { return Historia; }
            set { Historia = value; }
        }
        public void Leer()
        {
            System.Console.WriteLine("Leer Historia: ");
            Historia = Console.ReadLine();
        }
        public void Mostrar()
        {
            System.Console.WriteLine(Historia);
        }
    }
}