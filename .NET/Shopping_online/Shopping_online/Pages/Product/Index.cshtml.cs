using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace Shopping_online.Pages.Product
{
    public class IndexModel : PageModel
    {
        public void OnGet()
        {
        }
    }
    public class Product 
    {
        public String product_id;
        public String product_name;
        public String product_price;
        public String product_quantity;
        public String product_details;
        public String product_photo;

    }

}
