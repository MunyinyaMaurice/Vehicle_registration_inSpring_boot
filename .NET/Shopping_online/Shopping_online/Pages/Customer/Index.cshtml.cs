using Microsoft.AspNetCore.Hosting.Server;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using System.Data.SqlClient;


namespace Shopping_online.Pages.Customer
{
    public class IndexModel : PageModel
    
    {
        public List<Customer> listCustomer = new List<Customer>();
        public void OnGet()
        {
            try
            {
                String connectionString ="Server = DESKTOP-4FT1UMV\\SQLEXPRESS;Database=Ease_OnlineShoping;Trusted_Connection=True;MultipleActiveResultSets=True";
                //  "Data Source=DESKTOP-4FT1UMV\\SQLEXPRESS;Initial Catalog=Ease_OnlineShoping;Integrated Security=True";
                using (SqlConnection connection = new SqlConnection(connectionString)) 
                {
                    connection.Open();
                    String sql = "SELECT * FROM Customer";
                    using (SqlCommand command = new SqlCommand(sql, connection))
                    {
                        using (SqlDataAdapter reader = command.ExecuteReader())
                        { 
                        
                        }
                                { 
                        }
                    }
                }
            }
            catch(Exception ex)
            {

            }
        }

    }
    public class Customer
    {
        public String customer_id;
        public String custome_names;
        public String custome_email;
        public String custome_phoneNo;
        public String custome_yeaOfDate;
        public String custome_nationality;
        public String custome_address;      
    }
}
